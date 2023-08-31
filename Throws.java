class A {
    public A() {
        System.out.println("Class loaded");
    }
    public void show1() throws  ClassNotFoundException {
        Class.forName("Throws");
    }
    public void show2() throws ClassNotFoundException {
        Class.forName("Trial");
    }
}
public class Throws {
    public static void main(String args[])
    {
        A obj1 = new A();
        try {
            obj1.show1();
        }
        catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        A obj2 = new A();
        try {
            obj2.show2();
        }
        catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}

/*
class A {
    public A() {
        System.out.println("Class loaded");
    }
    public void show1() throws  ClassNotFoundException {
        Class.forName("Throws");
    }
    public void show2() throws ClassNotFoundException {
        Class.forName("Trial");
    }
}

public class Throws {
    public static void main(String args[]) throws ClassNotFoundException
    {
        A obj1 = new A();
        obj1.show1();
        A obj2 = new A();
        obj2.show2();
    }
}
*/


/*
class A {
    public A() {
        System.out.println("Class loaded");
    }
    public void show1()
    {
        try {
            Class.forName("Throws");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found");
        }
    }
    public void show2()
    {
        try {
            Class.forName("Trial");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found");
        }
    }
}
public class Throws {
    public static void main(String args[])
    {
        A obj1 = new A();
        obj1.show1();
        A obj2 = new A();
        obj2.show2();
    }
}
*/
