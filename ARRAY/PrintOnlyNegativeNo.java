package ARRAY;
import java.util.Scanner;
public class PrintOnlyNegativeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the array size=");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.print("enter the array element=");
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }
        System.out.print("print omly negative element=");
        for(int i=0;i<x.length;i++){
            if(x[i]<0){
                System.out.print(x[i]+" ");
            }
        }
     
    }
    
}
