package ARRAY;

public class MoveAllZeros {
    public static void main(String[] args) {
        int []arr={1,0,5,0,3,5,0};
        int j=0;
        for(int i=0;i<arr.length;i++){
         
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    
}
