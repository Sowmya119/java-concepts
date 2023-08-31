class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("In C show");
    }
}

public class Polymorphism
{
    public static void main(String args[])
    {
        A obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

// Polymorphism types ----> Compile-time (method overloading) and Run-time (method overriding)

// Even though the variable obj is of type A it is an oject of class B
    // So, class B's show method has the first preference
    
// obj is assigned to be an object of class B first and then of class C later on
    // This is possible only because B and C are children of A and obj is of type A