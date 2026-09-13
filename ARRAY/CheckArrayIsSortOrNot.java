package ARRAY;
import java.util.Scanner;
public class CheckArrayIsSortOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size=");
        int n=sc.nextInt();
        System.out.print("enter the array element=");
      int []arr=new int[n];
     System.out.print("print array=");
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
System.out.print(arr[i]+" ");
     }
     for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
         System.out.println("array is sorted");
         break;
        }
        else System.out.println("array is not sorted");
        break;
     }
     
    }
    }
    

