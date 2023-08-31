abstract class Car      // abstract class
{
    public abstract void drive();   // a method that is declared and not defined is an abstract method
    
    public void music()
    {
        System.out.println("Playing music");
    }
}

class Hyundai extends Car   // concrete class
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class Abstract
{
    public static void main(String args[])
    {
        Car obj1 = new Hyundai();
        obj1.drive();
        obj1.music();
    }    
}

// An abstract method should only be in an abstract class
// An abstract class may have all its methods defined
// Abstract classes can be referred by variables. But we cannot create objects of abstract classes

// All the abstract methods of the superclass should be defined in the concrete class