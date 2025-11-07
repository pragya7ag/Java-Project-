class Mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ": " + price + " " + name);
    }
}


public class StaticVar {
    public static void main(String[]args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.brand = "Samasung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile obj3 = new Mobile();
        obj3.brand = "GooglePixle";
        obj3.price = 2500;
        Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
