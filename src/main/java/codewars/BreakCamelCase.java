package codewars;
import java.util.ArrayList;
import java.util.List;
//https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("camelcasingtest"));
    }

    public static String camelCase(String input) {
        List words = new ArrayList<String>();
        String word = "";
        int startWord = 0;

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (Character.isUpperCase(curr)) {
                word = input.substring(startWord, i);
                startWord = i;
            }

            if (i == input.length() - 1) {
                word = input.substring(startWord, i + 1);

            }

            if (word.length() > 0) {
//                word = Character.toLowerCase(word.charAt(0)) + word.substring(1);
                words.add(word);
            }

            word = "";
        }
        return String.join(" ", words);
    }
}
