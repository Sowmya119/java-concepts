class Profile
{
    String name;
    int marks;

    public Profile()    // default constructor
    {
        marks = 300;
        name = "Kousi";
    }

    public Profile(String name, int marks)      // parameterized constructor
    {
        this.name = name;
        this.marks = marks;
    }

    public Profile(String name)
    {
        this.name = name;
        this.marks = 100;
        // marks = 100;     ----> this also works
    }
}

public class Constructor
{
    public static void main(String args[])
    {
     
     Profile obj = new Profile();
     System.out.println(obj.name + " : " + obj.marks);

     Profile obj1 = new Profile("Sriram", 200);
     System.out.println(obj1.name + " : " + obj1.marks);   

     Profile obj2 = new Profile("Mom");
     System.out.println(obj2.name + " : " + obj2.marks);   
      
    }
}