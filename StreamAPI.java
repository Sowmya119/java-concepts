import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(2, 5, 7, 9, 3, 6);
        
        Stream<Integer> s1 = nums.stream(); // get the array as a stream
        Stream<Integer> s2 = s1.filter(n -> (n%2==0));
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);

        // Alternate way
        int res = nums.stream().filter(n -> (n%2==0)).map(n -> n*2).reduce(0, (c,e) -> c+e);
        System.out.println(res);

        int sum = 0;

        for(int n : nums) {
            if(n%2 == 0) {
                n = n*2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
    }    
}

// A stream can be used only once
// Changes in streams don't affect the original list