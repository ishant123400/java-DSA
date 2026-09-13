package ARRAY;
import java.util.Scanner;
public class SumOfElementInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size=");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.print("enter the array element=");
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();
        }
        System.out.print("sum of element=");
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];}
            System.out.print(sum);
        
    }

    
}
