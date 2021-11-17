import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class Driver {
    public static void main(String[] args) {
        Driver d = new Driver();
        // d.doIntEnumeration();
        // d.doStringEnumeration();
        // d.doPersonEnumeration();
        Integer[] a1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        d.doEnumeration(a1);
        String[] a2 = { "Phil", "Fred", "Joe", "Eddie" };
        d.doEnumeration(a2);
        Person[] a3 = { new Person("Phil", 41), new Person("Eddie", 34), new Person("Fred", 23),
                new Person("Joe", 56) };
        d.doEnumeration(a3);
    }

    // Two different ways of populating a List<T> with and array T[]
    // 1) doIntEnumeration uses Collections.addAll(list, array)
    // 2) doStringEnumeration uses list = Arrays.asList(array)

    // Demonstrate using legacy Enumeration<Integer> with ArrayList through adapter
    // class IteratorEnumeration, which meets
    // the Enumeration interface, but uses Iterator under the hood.
    public void doIntEnumeration() {
        List<Integer> list = new ArrayList<>();
        Integer[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        Collections.addAll(list, array);

        Enumeration<Integer> en = new IteratorEnumeration<>(list.iterator());
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }

    // Demonstrate using legacy Enumeration<String> with ArrayList through adapter
    // class IteratorEnumeration, which meets
    // the Enumeration interface, but uses Iterator under the hood.
    public void doStringEnumeration() {
        List<String> list = new ArrayList<>();
        String[] array = { "Phil", "Fred", "Joe", "Eddie" };
        list = Arrays.asList(array);

        Enumeration<String> en = new IteratorEnumeration<>(list.iterator());
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }

    public void doPersonEnumeration() {
        List<Person> list = new ArrayList<>();
        Person[] array = { new Person("Phil", 41), new Person("Eddie", 34), new Person("Fred", 23),
                new Person("Joe", 56) };
        Collections.addAll(list, array);
        System.out.println(list);

        Enumeration<Person> en = new IteratorEnumeration<>(list.iterator());
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }

    // This is a generic catchall method that does the same as the two above, but
    // takes any type of array
    public <T> void doEnumeration(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        System.out.println(list);
        Enumeration<T> en = new IteratorEnumeration<>(list.iterator());
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        System.out.println();
    }

}