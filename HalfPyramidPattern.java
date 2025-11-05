
import java.util.Scanner;

public class HalfPyramidPattern {
   public static void main (String[]args ){
        Scanner myobj = new Scanner(System.in);
        int n;
        System.out.println("Enter number to form pyramid length");
        n = myobj.nextInt();

         for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
         }

}
}

    
