package syntaxis_practics.data_structures.arrays_lists_training.comparator_train;

public class Person{
    public String name;
    public Byte age;

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
