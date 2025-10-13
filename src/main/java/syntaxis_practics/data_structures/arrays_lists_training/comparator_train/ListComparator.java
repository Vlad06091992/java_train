package syntaxis_practics.data_structures.arrays_lists_training.comparator_train;


//Лямбда: написать Comparator<Person>
// по возрасту, затем по имени, применить сортировку списка.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListComparator {

    public static List<Person> persons = new ArrayList<>(List.of(
            new Person("Федя", (byte) 3),
            new Person("Муся", (byte) 3),
            new Person("Кеша", (byte) 3),
            new Person("Влад", (byte) 33),
            new Person("Даша", (byte) 26),
            new Person("Женя", (byte) 26),
            new Person("Илья", (byte) 34)
    ));

    public static void main(String[] args) {


        // с помощью компоратора
        // persons.sort(new PersonComparator());


        //короткая запись с помощью Comparator.comparing
         // persons.sort(Comparator.comparing((Person p) -> p.age).thenComparing(p -> p.name));

        //лямбда функция
        persons.sort((p1, p2) -> {
            int res = p1.age.compareTo(p2.age);
            return res != 0 ? res : p1.name.compareTo(p2.name);

        });

        System.out.println(persons);
    }
}
