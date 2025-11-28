// class-> class-> extends
// class-interface->implemets
//interface-interface ->extends



interface A{
    int age =44;
    String area="Mumbai";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X {

}

class B implements A,Y {
    public void config(){
        System.out.println("in Config");
    }

    public void show(){
        System.out.println("in show");
    }
    public void run(){
        System.out.println("in Config");
    }
}

public class Multipleinterf {
    public static void main(String[]args){
    A obj ;
    obj = new B();
    obj.show();
    obj.config();
    X obj1 =new B();
    obj1.run();

    System.out.println(A.area);
    }
}
