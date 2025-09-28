package syntaxis_practics.codewars;

import java.util.*;

//https://www.codewars.com/kata/594093784aafb857f0000122/train/java

public class DiffCollections {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {

        TreeSet<Character> result = new TreeSet<>();

        Set<Character> aSet = new HashSet<>(a);
        Set<Character> bSet = new HashSet<>(b);

        for (Character ch : aSet) {
            if (!bSet.contains(ch)) {
                result.add(ch);
            }
        }

        for (Character ch : bSet) {
            if (!aSet.contains(ch)) {
                result.add(ch);
            }
        }

        return new ArrayList<>(result);
    }

    public static List<Character> list(char... elements) {
        ArrayList<Character> list = new ArrayList<>();
        for (char s : elements) {
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(diff(list('a', 'b'), list('v')));
    }
}