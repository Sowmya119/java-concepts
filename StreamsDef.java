import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDef {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(2, 5, 7, 9, 3, 6);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n%2 == 0;
            }
        };

        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            public Integer apply(Integer c, Integer e) {
                return c*e;
            }
        };
        
        
        int res = nums.stream().filter(p).map(f).reduce(1, b);
        System.out.println(res);

        Stream<Integer> sortedValues = nums.stream().filter(p).sorted();
        sortedValues.forEach(n -> System.out.println(n));

    }    
}

// filter() --> accepts Predicate object where test() has to be defined
// map() --> accepts Function object where apply() has to be defined
// reduce() --> accepts BinaryOperator object where apply() has to be defined

// parallelStream() --> for threads