class human{
    private int age;
    private String name;

public human ()
{
   age =12;
   name = "John";
}

public human(int age,String name){ //parameterised constructor 

    this.age =age ;
    this.name =name;
  
    }

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}  
    
}

public class Constructor {
    public static void main(String[]args){
        human obj = new human();
        human obj1 = new human(21, "Pragya");
        System.out.println(obj.getName() +" : " +obj.getAge());
        System.out.println(obj1.getName() +" : " +obj1.getAge());
        
}
}