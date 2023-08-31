import java.util.*;

public class Collections_Learn {
    public static void main(String args[]) {
        // Collection<Integer> nums = new ArrayList<Integer>();

        List<Integer> nums = new ArrayList<Integer>(); // List gives additional methods such as get(), set() etc..
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(6);
        
        System.out.println(nums.size());
        System.out.println(nums.contains(6));
        System.out.println(nums);
        System.out.println();

        System.out.println(nums.get(0));
        nums.set(3, 33);
        System.out.println();
        
        for(int n : nums) {
            int num = (int)n;
            System.out.println(num*2);
        }
        System.out.println();

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()) {
            System.out.println(values.next());
        }
        System.out.println();

    }  
}

// Collections don't have index references
// To only add and fetch values, Collections is preferred
// To refer indices, Lists is preferred