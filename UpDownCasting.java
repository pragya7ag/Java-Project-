class A{
public void show1(){
    System.out.println("in A show");
}
}

class B extends A{
    public void show2(){
    System.out.println("in B show");
}
}

public class UpDownCasting {
    public static void main(String[]args){

        //upcasting 
        A obj = new B();
        obj.show1();

        //DownCasting
        B obj1 =(B) obj ;
        obj1.show2();
    }
}
