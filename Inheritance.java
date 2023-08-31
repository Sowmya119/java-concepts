class Calc
{
    public int add(int n1, int n2)
    {
        return n1+ n2;
    }
}

class AdvCalc extends Calc
{
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }   
}

class MostAdvCalc extends AdvCalc
{
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }

    public double div(double n1, double n2)
    {
        return n1/n2;
    }   
}

public class Inheritance
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        int result1 = obj.add(3, 5);
        int result2 = obj.sub(3, 5);
        System.out.println(result1 + " " + result2);

        MostAdvCalc obj1 = new MostAdvCalc();
        int result3 = obj1.multi(3, 5);
        double result4 = obj1.div(3, 5);
        int result5 = obj1.add(3, 5);
        int result6 = obj1.sub(3, 5);
        System.out.println(result3 + "  " + result4 + "  " + result5 + "  " + result6);
    }
}