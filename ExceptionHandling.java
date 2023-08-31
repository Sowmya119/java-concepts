class MyException extends RuntimeException
{
    public MyException(String s)
    {
        super(s);
    }
}

// 2.
// the new exception class should extend the Exception (or) Runtime Exception class
// in order to print the exception's message in addition to the catch block message, a parameterized constructor has to be created
    // the message should also be passed to the super class's constructor --> super(s)

public class ExceptionHandling
{
    public static void main(String args[])
    {
        int i = 18;
        int j = 20;
        try
        {
            j = i/j;
            if(j == 0)
            throw new MyException("Quotient cannot be zero");   // 1. created a new exception class
        }
        catch(MyException e)
        {
            j = 18/1;
            System.out.println(j);
            System.out.println("this is a default output " + e);
            System.out.println("this is a default output ");
        }
        try {
            i = i/0;
        }
        catch(ArithmeticException e) {
            System.out.println("No result " + e);
        }
    }    
}
