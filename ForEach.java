import java.util.*;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(4, 6, 8, 9, 3);
        nums.forEach(n -> System.out.println(n));
        System.out.println();

        Consumer<Integer> obj = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        nums.forEach(obj);
    }
}

// forEach() is a method in List that accepts a Consumer object
// Consumer is a functional interface with accept(T t) method
    // So, a lambda expression can be written for the Consumer object to be passed to forEach()