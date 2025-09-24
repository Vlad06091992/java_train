package syntaxis_practics.data_structures.arrays_lists_training;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSetStream {
    /*
    Лист - динамический массив, хранит любой порядок,
    дубликаты допустимы,
    быстрый доступ по индексу
    медленный поиск - только перебор
     */
    public static List<String> wordsList = new ArrayList<>(List.of(new String[]{"one", "two"}));


    /*
    HashSet - множество (Set), хранит только уникальные элементы,
    порядок НЕ сохраняется,
    нет доступа по индексу,
    очень быстрый поиск (через хэш, O(1)),
    подходит, когда важна уникальность и скорость, но порядок не важен.

    TreeSet - множество (Set), хранит только уникальные элементы,
    автоматически сортирует (натуральный порядок или компаратор),
    нет доступа по индексу,
    поиск/добавление медленнее (O(log n), т.к. дерево),
    подходит, когда нужны уникальные + отсортированные данные.
    */

    public static Set<String> wordsSet = new TreeSet<>(List.of(new String[]{"one", "two"}));


    public static void setToStreamAndBack(Set<String> set){
        Stream<String> stream = set.stream();
        Set<String> fromStream = stream.collect(Collectors.toSet());
        String string = fromStream.toString();
        System.out.println(string);
    }

    public static void ArrayListToStreamAndBack(List<String> list){
        Stream<String> stream = list.stream();
        List<String> fromStream = stream.collect(Collectors.toList());
        String string = fromStream.toString();
        System.out.println(string);
    }



    public static void main(String[] args) {
        setToStreamAndBack(wordsSet);
        ArrayListToStreamAndBack(wordsList);

    }
}
