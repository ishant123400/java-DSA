package ARRAY;
import java.util.Scanner;
public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the saize of array=");
        int n=sc.nextInt();
        int [] x=new int[n];
        System.out.print("enter the array element=");
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }
        System.out.print("maximum element=");
        for(int i=0;i<x.length;i++){
            int max=x[0];
            if(x[i]>max){
                System.out.print(x[i]+" ");
            }
        }
    }

    
}
