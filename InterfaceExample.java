interface Computer
{
    void code();
}

class Laptop implements Computer
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

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("In desktop coding");
    }
}

// instead of overloading work() with each Computer type, an interface type can be passed

class Developer
{
    public void work(Computer comp)
    {
        comp.code();
    }
}

public class InterfaceExample
{
    public static void main(String args[])
    {
        Developer doly = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();
    

        doly.work(lap);
        doly.work(desk);

        // lap.smart(); ----> error because smart() is not defined in type Computer

        Laptop lap1 = new Laptop();
        lap1.smart();
    }    
}

// Without interfaces we have to either override parent class methods or overload methods for different subclass types of an abstract class