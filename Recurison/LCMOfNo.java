package Recurison;

import java.util.Scanner;

public class LCMOfNo {
       public static void main(String[] args) {
        //using recursion
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=a*b;
         gcd(a,b);
         int g=gcd(a,b);
         System.out.println(c/g);
    }
    public static int gcd(int a,int b){
        if(a==0) return b;
        else return gcd(b%a,a);
    }
    
}
