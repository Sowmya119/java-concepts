class Mobile
{
    String brand;
    int price;
    static String type;

    public void details()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }
    
    public static void info(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
        
    }

/*  Error:
  
    public static void info()
    {
        System.out.println(brand + " : " + price + " : " + type);
        
    } */

}

public class Statics
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
        System.out.println(Mobile.type);

        // System.out.println(Mobile.price); ----> Error        

        Mobile.info(obj1);
        Mobile.info(obj2);

        // obj1.info(); ----> Error

    }
}