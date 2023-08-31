import java.util.*;
class Student implements Comparable<Student>
{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name : " + name + "   -----   " + "Age: " + age;
    }

    public int compareTo(Student that) {
        if(this.age > that.age)
                    return 1;
                else
                    return -1;
    }
}
public class SortList_2 {
    public static void main(String args[]) {

        Comparator<Student> comp = (i, j) -> (i.age > j.age)?1:-1;

        List<Student>studs = new ArrayList<Student>();
        studs.add(new Student("Kousi", 23));
        studs.add(new Student("Sriram", 18));
        studs.add(new Student("Mom", 53));
        studs.add(new Student("Jayesh", 15));
        studs.add(new Student("Pranesh", 8));

        Collections.sort(studs,comp);

        // Collections.sort(studs);

        for(Student s : studs) {
            System.out.println(s);
        }
    }
}

// Method 1 --> Passing a Comparator object
    // The comparison is done by another class

// Method 2 --> Implementing compareTo() method from Comparable interface
    // The objects compare themselves within the same class