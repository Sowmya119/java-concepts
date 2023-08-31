enum Laptop
{
    Dell(1000), HP(600), Asus(), Lenovo(500);

    private int price;

    private Laptop()
    {

    }

    // without the default constructor it is not possible to skip the assignment of price to any particular object

    private Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}

public class Enum
{
    public static void main(String args[])
    {
        System.out.println(Laptop.values());    // values() return the objects of enum in an array
        System.out.println(Laptop.values()[2]);

        for(Laptop lap : Laptop.values())
        System.out.println(lap + " : " + lap.getPrice());

        Laptop obj = Laptop.Asus;
        obj.setPrice(300);
        System.out.println(obj + " : " + obj.getPrice());
    }
}