// interface ----> provides only design but don't do anything
    // by default all methods afre public abstract
    // by default all variables are final static

interface A
{
    void show();
    void config();
}

interface B
{
    int num = 15;
    void run();
    void show();
}

interface C extends B   // an interface can inherit another interface
{

}

class X implements A, B     // a class can implement multiple interfaces
{
    public void show()
    {
        System.out.println("in X show");
    }
    public void config()
    {
        System.out.println("in X config");
    }
    public void run()
    {
        System.out.println("in X run");
    }
}

// if all the declared methods of the interfaces being implemented are not defined then the class remains to be an abstract class

class Y implements C
{
    public void show()
    {
        System.out.println("in Y show");
    }
    public void config()
    {
        System.out.println("in Y config");
    }
    public void run()
    {
        System.out.println("in Y run");
    }
}

public class Interface
{
    public static void main(String args[])
    {
        A obj1 = new X();
        obj1.show();
        obj1.config();

        // obj1.run();     ----> This gives error because run() is not defined in type A

        C obj2 = new Y();
        obj2.run();

        X obj3 = new X();
        obj3.show();
        obj3.config();
        obj3.run();

        System.out.println(B.num);
    }   
}