package Recurison;
import java.util.Scanner;
public class FactorialOfNo {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0||n==1) {
            return 1;}
          return n*fact(n-1);
    }

    
}
