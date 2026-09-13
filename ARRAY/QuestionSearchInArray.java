package ARRAY;
import java.util.Scanner;
public class QuestionSearchInArray {
    public static void main(String[] args) {
        int[] x={2,2,123,34,4,243};
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        System.out.print("enter the value odf n==");
        int target=sc.nextInt();
        for(int i=0;i<x.length;i++){
            if(x[i]==target){
                flag=true;
                break;
            
            }
    
        }
        System.out.println(flag);
    }}

    

    

