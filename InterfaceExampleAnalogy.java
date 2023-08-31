abstract class Computer
{
    public abstract void code();
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("In laptop coding");
    }

    public void smart()
    {
        System.out.println("Smart laptop");
    }
}

class Desktop extends Computer
{
    public void code()
    {
        System.out.println("In desktop coding");
    }
}

class Developer
{
    public void work(Laptop lap)
    {
        lap.code();
    }

    public void work(Desktop desk)
    {
        desk.code();
    }
}

public class InterfaceExampleAnalogy
{
    public static void main(String args[])
    {
        Developer doly = new Developer();
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        doly.work(lap);
        doly.work(desk);
    }    
}

// types of interface - Normal, Functional/ SAM, Marker
    // Normal - at least 2 methods
    // Functional - exactly one method
    // Marker - no method
        // with marker interface an object can be created and stored in hardware (Serialization)
        // later the object that is deleted from the heap memory can be recreated from the hardware (Deserialization)