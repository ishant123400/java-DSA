package ARRAY;
import java.util.Scanner;
public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the saize of array=");
        int n=sc.nextInt();
        int [] x=new int[n];
        System.out.print("enter the array element=");
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();}
            int a=1;
            System.out.print("product of array element=");
            for(int i=0;i<x.length;i++){
                a=a*x[i];
            }
            System.out.print(a+" ");
    }    
}
