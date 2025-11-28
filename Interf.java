interface A{
    
    int age = 44;  // all the variable in interface are final or static
    String area = "Mumbai" ;
    
    
    void show();
    void area();

}
class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public void area(){
        System.out.println("in Confiig");
    }
}


public class Interf {
    public static void main(String[]args){
        A obj;
        obj =new B();
        obj.show();
        obj.area();

        System.out.println(A.area);

        System.out.println(A.age ) ;

    }
}
