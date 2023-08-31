// final variables ----> for constant values
// final methods ----> to stop overriding
// final classes ----> to stop inheritence

class Calci
{
    final public void intro()
    {
        System.out.println("By Sriram");
    }

    public void add(int n1, int n2)
    {
        System.out.println(n1 + n2);
    }
}

final class AdvCalci extends Calci
{

    /*    
    public void intro()
    {
        System.out.println("By Kousi");
    }
*/

// This will throw an error because a final method cannot be overridden

}

public class Final
{
    public static void main(String args[])
    {
        final int num = 10;
        System.out.println(num);

        AdvCalci obj1 = new AdvCalci();
        obj1.intro();
        obj1.add(2, 6);

    }    
}
