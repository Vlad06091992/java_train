package syntaxis_practics.data_structures.arrays_lists_training;

import java.util.*;
import java.util.stream.Collectors;

//• Массив → Список: конвертировать String[] в List<String>, удалить дубликаты, отсортировать по длине.

public class ArrayToList {

    static final String[] words = new String[]{"one", "two", "three", "one", "two", "four", "s", "bn", "ten"};


    public static void main(String[] args) {

        List<String> wordsList = new ArrayList<>(List.of(words));
        wordsList = wordsList
                .stream()
                .distinct()
                .collect(Collectors.toList());
//        wordsList.sort((a, b) -> Integer.compare(a.length(), b.length()));
        wordsList.sort(Comparator.comparingInt(String::length));

        System.out.println(wordsList.toString());

    }
}
