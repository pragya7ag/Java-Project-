import java.io.*;
import java.util.Scanner;

public class Fibbonacchiseries {

    static int Fibbonacci(int n){
        if(n==0 || n<=1){
            return n;
        }
        
        return Fibbonacci(n-1) + Fibbonacci(n-2);
    }

    public static void main(String args[]){
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter n :");
        int n ;
        n = obj.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(Fibbonacci(i) + " ");
        }
        System.out.println();
        obj.close();
    }
    
}