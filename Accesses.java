import packages.*;

class temp extends Protection
{
    public int method()
    {
        temp obj4 = new temp();
        return obj4.age;
    }
}

public class Accesses
{
    public static void main(String args[])
    {
        Sample_1 obj1 = new Sample_1();
        Sample_2 obj2 = new Sample_2();
        Checker obj3 = new Checker();
        System.out.println(obj1.marks);
        System.out.println(obj2.marks);
        System.out.println(obj3.marks);
        
        /* Protection obj4 = new Protection();
        System.out.println(obj4.age); */

        // The above code block throws an error because we try to access a protected variable in a different package non sub-class

        temp obj5 = new temp();
        int r = obj5.method();
        System.out.println(r);

    }
}


// java.lang.* ----> This package is imported by default in every java file
    // this has the System class

// import folder.* ----> This imports all files in "folder" but not the files in the sub-folders of "folder"

// default variables
    // accessible within a package; (Checker variables are accessible in Accesses)
    // not accessible in other packages (Sample_1, Sample_2 variables are not accessible in Accesses)
    // however objects of Sample_1, Sample_2 can be created in Accesses **only after importing packages**


// public variables ----> accessible from anywhere (within a package and also in other packages)
    // Checker, Sample_1, Sample_2 variables are all accessible in Accesses

// private variables ----> Accessible only within the class
    // not even accessible within packages/ classes

// protected variables ----> Accessible within the same class, same package sub-class, same package non sub-class, different package sub-class
    // not accessible from a different package non sub-class