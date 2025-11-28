abstract class Car{
    public abstract void drive();

    public void playmusic(){
        System.out.println("play music");
    }
}


abstract class WaganoR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

class updatedWaganoR extends WaganoR{ //Concrete Class 
    public void fly(){
        System.out.println("it will start flying in 2050")
    }
}


public class AbstractClass {
    public static void mian(String[]args){
        Car obj = new updatedWaganoR() ;
         obj.drive();
         obj.playmusic();   
        

    }
}
