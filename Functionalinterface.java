@FunctionalInterface
interface A{
    void show();
    
}



public class Functionalinterface {
    public static void main(String[]args){
        A obj = new A() {
            public void show(){
                System.out.println("in Show");
            }
        };

        obj.show();
    }
    
}
