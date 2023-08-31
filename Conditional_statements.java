/*class Conditional_statements {
    public static void main(String[] args) {
        int x = 9;
        double y = 12.5;
        byte z = 14;
        if(x > y && x > z)
        System.out.println(x);
        else if(y > z)
        System.out.println(y);
        else
        System.out.println(z);
    }
}

class Conditional_statements {
    public static void main(String[] args) {
        int x = 9;
        double y = 12.5;
        byte z = 14;
        if(x > y && x > z)
        {
        System.out.println(x);
        System.out.println("x is the greatest");
        }
        else if(y > z)
        {
        System.out.println(y);
        System.out.println("y is the greatest");
        }
        else
        {
        System.out.println(z);
        System.out.println("z is the greatest");
        }
    }
}
*/

class Conditional_statements {
    public static void main(String[] args) {
        int n = 22;
        /* if(n%2 == 0)
        System.out.println("1");
        else
        System.out.println("0"); */
        
        // Terenary operator
        // ___ ? ____ : ____
        // Condition ? Result for TRUE : Result for FALSE
        
        int result = (n%2 == 0) ? 1 : 0;
        System.out.println(result);
    }
}