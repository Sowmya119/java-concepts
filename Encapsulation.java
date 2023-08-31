class Profile
{
    private String name = "Sriram";
    private int marks = 200;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}

public class Encapsulation
{
    public static void main(String args[])
    {
        Profile obj = new Profile();
        obj.setName("Kousi");
        obj.setMarks(100);
        System.out.println(obj.getName() + " : " + obj.getMarks());

        Profile obj1 = new Profile();
        System.out.println(obj1.getName() + " : " + obj1.getMarks());

    }
}