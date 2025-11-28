public class ExceptionHandling {
    public static void main(String[]args){
        int i=2;
        int j=0;
        String str = null;

        int nums[]=new int[5];
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[6]);
        }

        catch(ArithmeticException e){  //for Airthmatic Exception Runtime Exception is Parent class

            System.out.println("Cannot divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Stay in your limit");
        }
        catch(Exception e){ // hirarechy is Airthmatic -> Runable -> Exception->Throwable

            System.out.println("Some issue Arised" + e);
        }
        



        System.out.println(j);
        System.out.println("Bye");
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     