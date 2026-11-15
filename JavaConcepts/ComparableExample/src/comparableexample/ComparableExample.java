package comparableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Alice"));
        list.add(new Student(1, "Bob"));
        list.add(new Student(2, "Charlie"));

        Collections.sort(list);     // uses Student.compareTo()
        System.out.println("Sorted by ID (Comparable) : " + list);
    }
}
