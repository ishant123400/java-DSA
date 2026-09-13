package Recurison;
import java.util.Scanner;
public class PrintDecreasingIncreasing {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("print");
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
       if(n!=1) System.out.println(n);
    }
    
}
