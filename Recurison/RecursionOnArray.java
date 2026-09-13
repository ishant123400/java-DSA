package Recurison;
//print array using recursion
public class RecursionOnArray {
    ////print from starting array
    // public static void main(String[] args) {
    //     int [] arr={2,4,1,45,3,34,4};
    //     arrprint(arr,0);
    // }
    // public static int arrprint(int[] arr,int idx){
    //     if(idx==arr.length) return 1;
    //     System.out.println(arr[idx]);
    //     return arrprint(arr,idx+1);
    // }


    ////print from last of array
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        arrprint(arr,n-1);
    }
    public static void arrprint(int[] arr,int idx){
        if(idx<0) return;
        System.out.print(arr[idx]+" ");
        arrprint(arr,idx-1);
    }
    
}
