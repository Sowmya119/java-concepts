import java.util.Scanner;

public class GetInput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // System.out.println(sc.nextInt());
        System.out.println("Enter a string:");
        System.out.println(sc.nextLine());
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInput {
    public static void main(String args[]) throws IOException {

        System.out.println("Enter a number:");
        
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        br.close(); // close resources
    }
}
*/
/*
import java.io.IOException;

public class GetInput {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a number:");
        System.out.println(System.in.read() - 48);  // read() given ASCI values        
    }
}
*/

