package syntaxis_practics.data_structures.arrays_lists_training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessOddNumbers {

    public static List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

    public static void main(String[] args) {

        List<Integer> result = list
                .stream()
                .filter(n -> {
                    if (n % 2 == 0)
                        return true;
                    return false;
                })
                .map(n -> n * 3)
                .sorted(Comparator.reverseOrder())
                .toList();


        System.out.println(result.toString());

    }
}
