import java.util.ArrayList;
import java.util.List;

class Student implements Comparable <Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    } 

    @Override
    public String toString() {  
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 19));
        students.add(new Student("Alice", 20));
        // students.sort((s1, s2) -> s1.name.compareTo(s2.name));

        // Error: Student does not implement Comparable<Student>
        // by null we do not know about natural ordering
        students.sort(null);
        System.out.println("Students: " + students);

        // We won't give ocmaprator (for custom logic)

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.sort(null);
        System.out.println("Numbers: " + numbers);
    }
}
