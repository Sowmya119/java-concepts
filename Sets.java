import java.util.*;

public class Sets {
    public static void main(String args[]) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(56);
        nums.add(78);
        nums.add(69);
        nums.add(53);
        nums.add(53);

        System.out.println(nums);

        nums.remove(54);
        System.out.println(nums);

        nums.remove(53);
        System.out.println(nums);

        for(int n : nums) {
            System.out.println(n);
        }
    }
}

// Instead of HashSet, if we use TreeSet we get the values in sorted order