
public class WrapperClass {
    public static void main(String[]args){
        
        //Primitive Variable
        int num =7;

        //Reference Variable
        Integer num1 = num ; //autoboxing 

        int num2 = num1; //Auto - Unboxing 

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);
    }
}
