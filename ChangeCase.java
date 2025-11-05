import java.util.Scanner;

public class ChangeCase {
    public static void main(String[]args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a string");
       String  s = myobj.nextLine();
       StringBuilder result = new StringBuilder();
       for(char ch:s.toCharArray()){
        if(Character.isUpperCase(ch)){
            result.append(Character.toLowerCase(ch));
        }else if (Character.isLowerCase(ch)){
            result.append(Character.toUpperCase(ch));
        }else{
            result.append(ch);
        }
       }
        System.out.println("Changed String " + result.toString());
    }
}
