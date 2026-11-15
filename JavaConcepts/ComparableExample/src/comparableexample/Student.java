package comparableexample;

/** Natural ordering of students is by id (Comparable). */
public class Student implements Comparable<Student> {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
