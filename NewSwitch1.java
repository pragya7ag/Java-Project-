public class NewSwitch1 {
    public static void main(String[]args){
            String day ="Wednesday";
            switch(day)
            {
                case "Saturday","Sunday" -> System.out.println("8am") ;
                case "Monday" -> System.out.println("6am") ;
                default -> System.out.println("7am") ;
            }
}
}


