package Recurison;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.=");
        int a=sc.nextInt();
        System.out.println("enter the power=");
        int b=sc.nextInt();
        pow(a,b);
        System.out.println(a+". arise to the power "+b+" is ="+pow(a,b));
    }
    public static int pow(int a,int b){
       if(b==0) return 1;
       int ans=pow(a,b/2);
       if(b%2==0){
        return ans*=ans;
       }
       else{
       return ans*=ans*a;
       }


    }
}