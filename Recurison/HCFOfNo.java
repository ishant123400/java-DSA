package Recurison;
import java.util.Scanner;
public class HCFOfNo {
    public static void main(String[] args) {
        //using recursion
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
         gcd(a,b);
    }
    public static void gcd(int a,int b){
        if(a==0) System.out.println(b);
        else gcd(b%a,a);
    }


        // int a=30;
        // int b=10;
        // int HCF=1;
        // for(int i=1;i<=Math.min(a,b);i++){
        //     if(a%i==0 && b%i==0) {
        //          HCF=i;
        //     }
        //  }
        //  System.out.println(HCF);
    } 
    

