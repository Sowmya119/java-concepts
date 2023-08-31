import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Finally {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a number:");

        // automatically closes the resource if declared in try()
        // try with resources
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println(Integer.parseInt(br.readLine()));
        }
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Finally {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a number:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println(Integer.parseInt(br.readLine()));
        }
        finally {
            br.close();
        }
    }
}
*/

// finally blocked is executed not only after try block but also after catch block
// So, statements/ processes that are independent of the try/ catch block are included in finally block
/*
public class Finally {
    public static void main(String args[]) {
        int i = 12;
        int j = 10;
        try
        {
            j = i/j;
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Bye");
        }
    }
    
}
*/