package syntaxis_practics.data_structures.arrays_lists_training.comparator_train;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {

        int result = p1.age.compareTo(p2.age);

        if (result != 0) {
            return result;
        } else {
            result = p1.name.compareTo(p2.name);

        }
        return result;
    }
}
