package ARRAY;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,7,3,8,4,6,7,5,6,7};
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    
}
