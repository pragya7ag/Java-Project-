import java.util.Scanner;

public class Squareroot {
    public static void main (String[]args ){
        Scanner myobj = new Scanner(System.in);
        int n;
        System.out.println("Enter a number whose square root  ");
        n = myobj.nextInt();
        int res =  (int)Math.sqrt(n);
        System.out.println(res);
    }
}