package ARRAY;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
    int[] nums={32,343,34,443,3,5434,34};
    int k=sc.nextInt();
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        for(int x:nums){
    System.out.print(x+" ");}
}
        public static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
    }
    
}
