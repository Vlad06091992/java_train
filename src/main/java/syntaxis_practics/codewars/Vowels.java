package syntaxis_practics.codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java

public class Vowels {


    public static void main(String[] args) {
        int res = getCount("o a kak ushakov lil vo kashu kakao");
        System.out.println(res);
    }

    public static int getCount(String str) {
         Set<String> vowels = new HashSet<>(Set.of("a", "e", "i", "o", "u"));

        return Arrays.stream(str
                .toLowerCase()
                .split(""))
                //                .filter((l) -> vowels.contains(l))
                .filter(vowels::contains)
                .toArray().length;
    }


}
