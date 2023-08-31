/* Example 1
class Increment_Operator {
    public static void main (String[] args) {
        int n = 100;
        int b = ++n;    //Pre-Increment
        int a = n++;    //Post-Increment
        System.out.println(a);
        System.out.println(b);
        System.out.println(n);
    }
} */

class Increment_Operator {
    public static void main (String[] args) {
        int n = 100;
        int a = n++;    //Post-Increment
        int b = ++n;    //Pre-Increment
        System.out.println(a);
        System.out.println(b);
        System.out.println(n);
    }
}