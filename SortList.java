import java.util.*;

public class SortList {
    public static void main(String args[]) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                   return -1;
            }
        };
        
        List<Integer> nums = new ArrayList<> ();
        nums.add(23);
        nums.add(45);
        nums.add(18);
        nums.add(36);
        nums.add(67);

        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort(nums, com);
        System.out.println(nums);

       // nums.sort(com);
       // System.out.println(nums);
      

    }
}
