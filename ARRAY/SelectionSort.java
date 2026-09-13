package ARRAY;

public class SelectionSort {
    public static void print(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
      
    }
    public static void main(String[] args) {
        int []arr={1,-3,-4,5,3,23};
        int n=arr.length;
        print(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;
                }}
             int temp=arr[i];
             arr[i]=arr[mindex];
             arr[mindex]=temp;
             
            
            
        }
        print(arr);

    }
    
}
