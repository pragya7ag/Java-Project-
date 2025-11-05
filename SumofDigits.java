import java.util.Scanner;

public class SumofDigits {
    public static void main (String[]args ){
        Scanner myobj = new Scanner(System.in);
        int n;
        System.out.println("Enter number");
        n = myobj.nextInt();
        int sum = 0;
        while(n!=0){
            int last = n %10;
            sum += last;
            n/=10;

        }
    System.out.println(sum);

}

}
