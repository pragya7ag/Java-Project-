abstract class A{
    public abstract void show();
}


public class AbstractAnno {
    public static void main(String[]args){
        A obj = new A()
        {
            public void show(){
                System.out.println("in new Show");
            }
        };

        obj.show();
    }
}
