public class Exceptions
{
    public static void main(String args[])
    {
        int i = 10;
        int j = 0;
        int[] arr = new int[5];

        try
        {
        System.out.println(i/j);
        System.out.println(arr[7]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Check the array index value");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        catch(Throwable e)
        {
            System.out.println("Throwable Exception");
        }
        System.out.println("Bye");
    }    
}


// Errors -- Compile time, Runtime and Logical

// Runtime errors are called Exceptions that are to be handled

// Exceptions are handled by try - catch blocks

// catch blocks of subclasses should be followed by that of super classes

// try block stops executing further the moment the first exception is found
    // however the code block that follows the try - catch block will still be successfully executed

// If a particular exception is not handled the remaining part of the program will also not be executed despite the existence of other catch blocks



// HIERARCHY

// Object ----> Throwable ----> Error && Exception ----> Runtime && SQL && IO Exception
    // Runtime -- Arithmetic, Array Index Out Of Bounds, Null pointer etc.. -- Also called Unchecked exceptions
    // Others (of Exceptions) are also called Checked Exceptions

// Errors -- Thread death, IO error, Virtual machine error, Out of memory