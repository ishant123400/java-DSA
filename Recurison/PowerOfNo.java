package Recurison;
import java.util.Scanner;
public class PowerOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the the no.=");
        int a=sc.nextInt();
        System.out.println("enter exponent=");
        int b=sc.nextInt();
        System.out.println(a+"raised to the power "+b+"="+pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        // time complexity is o(b)
        // return a*pow(a,b-1);
       

        //for best TC o(logb)
         int ans=pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return (ans*ans*a);

    }
    
}
