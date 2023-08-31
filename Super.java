class A // Every class in Java extends the Object class
{
    public A()
    {
        super();    // Every constructor has this super method which calls the constructor of the super class
        System.out.println("default in A");
    }

    public A(int n)
    {
        super();
        System.out.println("int - in A");
    }

    public A(String name)
    {
        super();
        System.out.println("String - in A");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("default in B");
    }

    public B(int n)
    {
        super();
        System.out.println("int - in B");
    }

    public B(String name)
    {
        super(name);    // To call the super class's parameterized constructor instead of the default constructor
        System.out.println("String - in B");
    }

    public B(double n)
    {
        this();    // this() method is used to execute the constructor of the same class
        System.out.println("double - in B");
    }

    public B(char c)
    {
        super("word");
        System.out.println("char - in B");
    }
}


public class Super
{
    public static void main(String args[])
    {
        B obj = new B();
        System.out.println();

        B obj1 = new B(3);
        System.out.println();

        B obj2 = new B("Kousi");
        System.out.println();

        B obj3 = new B(4.5);
        System.out.println();

        B obj4 = new B('d');
        System.out.println();
    }
}