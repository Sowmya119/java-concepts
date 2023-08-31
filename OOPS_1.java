class Calculator
{
    int s;
    public void add(int n1, int n2)
    {
        int r = n1 + n2;
        System.out.println(r);
    }
}
public class OOPS_1
{
    public static void main(String a[])
    {
        int num1 = 3;
        int num2 = 15;
        Calculator calc = new Calculator();     // referenced object
        calc.add(num1,num2);

        new Calculator().add(2, 3);         // anonymous object
    }
}