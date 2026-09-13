package ARRAY;

public class BubbleSortInReverseOrder {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,3,-6,4,2,5,76,0,-1};
        int n=arr.length;
        print(arr);
        System.out.println();
        for(int i=1;i<n;i++){
            int swap=0;
            for(int j=0;j<n-1;j++){
             if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                swap++;
             }
            
            }
            if(swap==0) break;
        }
        print(arr);
    }
    
}
