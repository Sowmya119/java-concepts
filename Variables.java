/* Example 1

class Variables
{
    public static void main(String a [])
    {
        int num1 = 2;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
    }
}*/

/* Typecasting Example 2*/

class Variables
{
    public static void main(String a [])
    {
        byte b1 = 32;
        byte b2 = 100;
        int i1 = 1000;
        int i2 = -400;
        b1 = (byte) i1;
        i2 = (int) b2;
        System.out.println(b1);
        System.out.println(i2);

    }
}
