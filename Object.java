class Laptop
{
    int price;
    String type;

    public String toString()
    {
        return type + " : " + price;
    }

    public boolean check(int price, String type)
    {
        return (this.price == price) && (this.type.equals(type));
    }
}

class Phone
{
    int price;
    String type;
}

public class Object
{
    public static void main(String args[])
    {
        Laptop obj1 = new Laptop();
        obj1.price = 1000;
        obj1.type = "Compact";
        System.out.println(obj1.toString());

        Laptop obj2 = new Laptop();
        obj2.price = 1000;
        obj2.type = "Compact";
        System.out.println(obj2.toString());

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        boolean result = obj1.check(obj2.price, obj2.type);
        System.out.println(result);

        Phone obj3 = new Phone();
        obj3.price = 600;
        obj3.type = "Smart";
        System.out.println(obj3.toString());
    }
}