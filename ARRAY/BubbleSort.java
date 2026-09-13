package ARRAY;

public class BubbleSort {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
           
            
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,5,4,3,2,4,55};
        int n=arr.length;
        print(arr);
        System.out.println();
        // for(int i=1;i<n-1;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(arr[j]>arr[j+1])
        //         {int temp=arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;}
                
        //     }
        // }
        //for better optimization;
        int swap=0;
         for(int i=1;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1])
                {int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            swap++;}
                
            }
            if(swap==0) break;
        }
        print(arr);
    }

    
}
