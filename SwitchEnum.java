enum Status{
    Running ,Failed,Pending,Success;
}

public class SwitchEnum {
    public static void main(String[]args){
        Status s= Status.Pending;
        switch(s)
        {
            case Running    :
                                System.out.println("All good");
                                break;
            case Failed     :   System.out.println("Try Again");
                                break;
            case Pending    :   System.out.println("Please Wait");
                                break;
            default         :   System.out.println("Done");
                                break;
        }

    }
        
}
