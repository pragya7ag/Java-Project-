import java.util.Scanner;

public class ReverseStr {
    public static void main (String[]args ){
        Scanner myobj = new Scanner(System.in);
        String str =" ";
        String reversedStr =" ";
        System.out.println("Enter the string to be reverse");
        str = myobj.nextLine();
        for(int i =0;i<str.length();i++){
                reversedStr = str.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
    }
}