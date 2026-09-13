package Recurison;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] a={2,3,2,5,23,4,32,43};
        int [] b={45,2,2332,546,324,4645,323};
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = new int[a.length+b.length];
        System.out.println();
        merge(a,b,c);
        for(int ele:c)
        System.out.print(ele+" ");
        
    }
    public static void merge(int []a,int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length &&j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }

    
}
