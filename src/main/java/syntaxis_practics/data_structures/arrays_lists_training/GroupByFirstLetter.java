package syntaxis_practics.data_structures.arrays_lists_training;

import java.util.*;

public class GroupByFirstLetter {

    public static Map<Character, List<String>> result = new HashMap<Character, List<String>>();

    public static List<String> words = Arrays.asList(
            "apple", "banana", "apricot", "cherry", "blueberry",
            "avocado", "blackberry", "coconut", "berry", "date"
    );

    public static void main(String[] args) {
        for (String word : words) {
            Character firstLetter = word.charAt(0);

            if (result.containsKey(firstLetter)) {
                result.get(firstLetter).add(word);
            } else {

                List<String> list = new ArrayList<>();
                list.add(word);

                result.put(firstLetter, list);
            }
        }

        System.out.println(result.toString());
    }

}
