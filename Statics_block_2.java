// calling static block with creating objects ----> Using the class "class" (forName)

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

public class Statics_block_2
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");
    }
}