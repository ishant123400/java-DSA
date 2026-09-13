package Recurison;
import java.util.Arrays;
public class MergeSortUsingMagic2 {
    public static void main(String[] args) {
        int [] arr={2,4,6,1,2,5,7,8,9,2,4,6,7,5,-3,-3,-4,0,100};
        mergesort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    private static void mergesort(int [] arr){
        int n=arr.length;
        if(n==1) return;// base case hai 1 length ka array pahele se sorted hai
        // step 1: create 2 new empty array of size n/2
        int[] a=new int[n/2];
        int [] b=new int [n-n/2];
        // step 2: copy paste arr into a and b
        int idx=0;//idx travel karenge arr pe
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx];
            idx++;
        }
        for(int j=0;j<b.length;j++){
            b[j]=arr[idx];
            idx++;
        }
        // step 3: magic hoga
        mergesort(a);
        mergesort(b);
        // step 4: merge 'a' and 'b' into arr ( ham naya array ni bna rahe hai kyu ki ki fayda nihai jbb ishi me add ho skta hai isliye)
        merge(a,b,arr);

    }
    private static void merge(int []a,int[] b, int[] arr){
        int i=0,k=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr[k]=a[i];
                k++;
                i++;
            }
            else{
                arr[k++]=b[j++];
                
            }
        }
            while(i<a.length){
                arr[k++]=a[i++];
            }
            while(j<b.length){
                arr[k++]=b[j++];
            }
        
    }

    
}
