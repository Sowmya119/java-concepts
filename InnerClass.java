class A
{
    int age;

    public void show1()
    {
        System.out.println("In A show");
    }

    class B     // inner class ----> class inside a class
    {
        public void show2()
        {
            System.out.println("In B show");
        }
    }

    static class C
    {
        public void show3()
        {
            System.out.println("In C show");
        }
    }
}

abstract class P
{
    public abstract void show5();
}

public class InnerClass
{
    public static void main(String args[])
    {
        A obj1 = new A();
        obj1.age = 15;
        System.out.println(obj1.age);
        obj1.show1();

        A.B obj2 = obj1.new B();    // creating the object of an inner class
        obj2.show2();

        A.C obj3 = new A.C();       // Since it is a static class.
        obj3.show3();

// Only an inner class can be static. An outer class cannot be static

        A obj4 = new A()        // anonymous inner class ----> to avoid exactly 1 method overriding
        {
        public void show1()
        {
            System.out.println("In new show");
        } 
        };
        obj4.show1();

// abstract anonymous inner class ----> to avoid implementing an abstract class only once

        P obj5 = new P()
        {
            public void show5()
            {
                System.out.println("In abstract anonymous inner show");
            }
        };
        obj5.show5();
    }    
}