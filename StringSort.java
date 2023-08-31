import java.util.*;

public class StringSort {
    public static void main(String args[]) {
        Comparator<String> com = new Comparator<String>() {
            public int compare(String a, String b) {
                if(a.length() > b.length())
                    return 1;
                else if(a.length() == b.length()) {
                    if(a.charAt(0) > b.charAt(0))
                      return 1;
                    else
                        return -1;
                }
                else
                    return -1;
            }
        };
        List<String> names = new ArrayList<String>();
        names.add("Kousi");
        names.add("Sriram");
        names.add("Mom");
        names.add("Jayesh");
        names.add("Pranesh");

        Collections.sort(names);
        System.out.println(names);
        
        Collections.sort(names, com);
        System.out.println(names);

    }
}
