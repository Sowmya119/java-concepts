class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}

public class Casting
{
    public static void main(String args[])
    {
        A obj1 = new B();       // Implicit Upcasting
        obj1.show1();

        // obj1.show2();
        // This gives an error because B's object obj1 is of type A that has no idea of the methods of class B

        B obj2 = (B) obj1;          // Explicit downcasting
        obj2.show1();
        obj2.show2();

    }    
}
