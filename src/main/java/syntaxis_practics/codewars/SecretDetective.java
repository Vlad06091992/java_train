package syntaxis_practics.codewars;

//https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java

//говновод канеш, но тесты прошли =)
import java.util.*;

public class SecretDetective {

    static Set<Character> deleted = new HashSet<>();
    static Map<Character, Chars> result = new HashMap<>();
    static String word = "";

    public static class Chars {

        Set<Character> before = new HashSet<>();

        public void addToBefore(char c) {
            before.add(c);
        }
    }

    public static String recoverSecret(char[][] triplets) {

        deleted.clear();
        result.clear();
        word = "";


        for (char[] triplet : triplets) {
            char first = triplet[0];
            char second = triplet[1];
            char third = triplet[2];

            if (!result.containsKey(first)) {
                Chars forFirst = new Chars();
                result.put(first, forFirst);
            }


            if (!result.containsKey(second)) {
                Chars forSecond = new Chars();
                forSecond.addToBefore(first);
                result.put(second, forSecond);
            }

            if (result.containsKey(second)) {
                result.get(second).addToBefore(first);
            }

            if (!result.containsKey(third)) {
                Chars forThird = new Chars();
                forThird.addToBefore(first);
                forThird.addToBefore(second);
                result.put(third, forThird);
            }

            if (result.containsKey(third)) {
                result.get(third).addToBefore(first);
                result.get(third).addToBefore(second);
            }

        }


        while (!result.isEmpty()) {

            List<Character> toRemove = new ArrayList<>();
            result.forEach((character, chars) -> {
                if (chars.before.isEmpty()) {
                    if (!deleted.contains(character)) {
                        word = word + character;
                    }
                    deleted.add(character);


                    toRemove.add(character);
                    result.forEach((c, chars1) -> {
                        chars1.before.remove(character);
                    });

                }
            });

            int index = toRemove.size() - 1;
            char last = toRemove.get(index);
            result.remove(last);
        }
        return word;
    }
}