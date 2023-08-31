// enum --> for constant values
    // it is also a class but without the inheritance property
    // the named constants are objects
    // enum extends an enum class that has its own methods 

enum Status
{
    Running, Failed, Success, Pending;
}

public class EnumIntro
{
    public static void main(String args[])
    {
        Status stat = Status.Success;
        System.out.println(stat.getClass().getSuperclass());
        System.out.println();

        System.out.println(stat);
        System.out.println(stat.ordinal());
        System.out.println();

        Status s[] = Status.values();
        System.out.println(s[3]);
        System.out.println();

        if(stat == s[0])
        System.out.println(stat + " : " + "In Progress");
        else if(stat == s[1])
        System.out.println(stat + " : " + "Try again");
        else if(stat == s[2])
        System.out.println(stat + " : " + "Done");
        else if(stat == s[3])
        System.out.println(stat + " : " + "None");
        System.out.println();

        switch (stat)
        {
        case Running:
        System.out.println(stat + " : " + "In Progress");
        break;
        case Failed:
        System.out.println(stat + " : " + "Try again");
        break;
        case Success:
        System.out.println(stat + " : " + "Done");
        break;
        case Pending:
        System.out.println(stat + " : " + "None");
        break;
        }
        System.out.println();

        for(Status n : s)
        {
            System.out.println(n);
        }
        System.out.println();

        for(Status n : s)
        {
            switch (n)
            {
            case Running:
            System.out.println(n + " : " + "In Progress : " + n.ordinal());
            break;
            case Failed:
            System.out.println(n + " : " + "Try again : " + n.ordinal());
            break;
            case Success:
            System.out.println(n + " : " + "Done  : " + n.ordinal());
            break;
            case Pending:
            System.out.println(n + " : " + "None : " + n.ordinal());
            break;
            }
        }
        System.out.println();
    }
}
