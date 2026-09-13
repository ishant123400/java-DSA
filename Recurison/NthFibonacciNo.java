package Recurison;
import java.util.Scanner;
public class NthFibonacciNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fab(n);
        System.out.println(fab(n));
    }
    public static int fab(int n){
        if(n<=1) return n;
        else {
            return fab(n-1)+fab(n-2);
        }

    }
    
}
