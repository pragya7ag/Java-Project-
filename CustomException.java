class PragyaException extends Exception{
    public PragyaException(String str){
        super(str);
        
    }
}




public class CustomException {
    public static void main(String[]args){
        int i =20;
        int j=0;
    try{
        j=18/i;
        if(j==0){
           throw new PragyaException("I dont want to print Zero"); 
        }
    }

    catch(PragyaException e){
        System.out.println("thats default output" + e);
     }
}
    
}
