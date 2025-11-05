 class Demo {

    public static void main(String[]args){
        String day ="Sunday";
        switch(day){
                case "Saturday","Sunday" ->  System.out.println("8am");
    
                case "Monday" -> System.out.println("5am");
                     
                default -> System.out.println("Print Valid day");
                    
        }
    }
} 
