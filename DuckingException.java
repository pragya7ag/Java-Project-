class A{
    public void show() throws ClassNotFoundException{
            Class.forName("calc");
    }
}




public class DuckingException {

    static { 
        System.out.println(" Class Loaded");
    }
    public static void main(String a[]){
        A obj = new A();

        try {
            obj.show();
    }
    catch(ClassNotFoundException e){
        e.printStackTrace();
        }
    }
}

