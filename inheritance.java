class Animal{
    void eat(){
        System.out.println("Aniamals eat food ");
    }

    public Animal(){
        
        System.out.println("My name is pragya");
    }
}

class Mammal extends Animal {
    void walk(){
      
        System.out.println("Mammals can walk");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Dog barks Loudly ");
    }
}

public class inheritance {
    public static void main(String[]args){
        Dog obj = new Dog();
        obj.eat();
        obj.walk();
        obj.bark();
    }
    
}
