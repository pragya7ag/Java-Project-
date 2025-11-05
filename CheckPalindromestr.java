import java.util.Scanner;

public class CheckPalindromestr {
        public static void main (String[]args ){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a string");
       String  s = myobj.nextLine();
        int left = 0;
        int right = s.length()-1;
         System.out.println("Enter a string");
        while(left<right){
        if(s.charAt(left)!= s.charAt(right)){
            System.out.println("String is not a palindrom");
             return ;
        }

               
             
            left ++;
            right--;
            

              
            
        }

        System.out.println("String is a palindrom");
       
    }
}
