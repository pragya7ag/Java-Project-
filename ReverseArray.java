import java.util.Scanner;

public class ReverseArray {
    public static void main(String[]args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            arr[i] =sc.nextInt();
        }
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
        System.out.println("Reversed array : ");
        for(int i =0;i<=5;i++){
            System.out.println(arr[i]);
        }


    }
}


