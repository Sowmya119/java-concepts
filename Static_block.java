// First a class loads and objects are instantiated
// Constructor has the default values for instance variables and it is loaded everytime an object is created
    // But it is not required to load static variables everytime an object is created.
    // So, a separate static block can be created
    // Despite the number of objects, the static block is loaded only for one time during the first object creation.

class Mobile
{
    String brand;
    int price;
    static String type;

    public void details()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }
    
    public Mobile()
    {
        brand = "";
        price = 500;
        System.out.println("to check constructor block loading");
    }

    static
    {
        type = "Phone";
        System.out.println("to check static block loading");
    }

}

public class Static_block
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Nokia";
        obj1.price = 200;
        obj1.type = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Motto";
        obj2.price = 1000;
        obj2.type = "Smartphone";

        obj1.details();
        obj2.details();

    }
}