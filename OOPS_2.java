class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing..");
    }
}
class pen
{
    public String getPen(int count)
    {
        if (count > 10)
            return "Pen";
        return "Nothing";
    }
}
class OOPS_2
{
    public static void main(String a[])
    {
        //int n = 4;
        Computer comp = new Computer();
        pen obj = new pen();
        comp.playMusic();
        String result = obj.getPen(14);      //obj.getPen(int n = 4) is wrong; No initialization in arguments
        System.out.println(result);
    }
}