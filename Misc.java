class A
{
    String name;
    int age;
    
    public A(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class Misc
{
    public static void main(String args[])
    {
        A obj1 = new A("Kousi", 23);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }    
}

// Annotations --> to interact with compilers (@Override) to avoid bugs and mistakes
