class Calculate
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int add(int n1, int n2, int n3)  // method overloading ----> the same method name is used to pass different parameters
    {
        return n1+n2+n3;
    }

    public double add(double n1, double n2)
    {
        return n1+n2;
    }
}

class AdvCalculator extends Calculate
{
    public int add(int n1, int n2)  // method overriding ----> sub class's method overrides the super class's method in the same name
    {
        return n1+n2+5;
    }
}


public class OverridingOverloading
{
    public static void main(String args[])
    {
        Calculate obj1 = new Calculate();
        int r1 = obj1.add(5, 6);
        int r2 = obj1.add(5, 6, 7);
        double r3 = obj1.add(2.3, 5.9);

        AdvCalculator obj2 = new AdvCalculator();
        int r4 = obj2.add(5, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}