import java.util.*;

public class Maps {
    public static void main(String args[]) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Kousi", 130);
        students.put("Sriram", 120);
        students.put("Mom", 160);
        students.put("Jayesh", 150);
        students.put("Pranesh", 90);
        students.put("Pranesh", 190);

/*
        System.out.println(students);
        System.out.println(students.values());
        System.out.println(students.entrySet());
        System.out.println(students.get("Mom"));
        System.out.println(students.keySet());
        System.out.println(students.isEmpty());
*/

        for(String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}

// Hashtable is almost the same as HashMap but the former is synchronized