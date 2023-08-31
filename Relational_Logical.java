/* class Relational_Logical {
    public static void main (String[] args) {
        double a = 3.9;
        float b = 5.3f;
        boolean c = a > b;
        System.out.println(c);
    }
} */

class Relational_Logical {
    public static void main (String[] args) {
        double a = 3.9;
        float b = 5.3f;
        int p = 3;
        byte q = 2;
        boolean c = p != b && a > q;
        boolean d = !c;
        System.out.println(c);
        System.out.println(d);
    }
} 