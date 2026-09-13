package Recurison;
import java.util.Arrays;
public class MergeSortUsingMagic {
    public static void main(String[] args) {
        int []a={2,432,5,3,32,2,1,54,5243};
        int n=a.length;
        int[] b=new int[n/2];
        int[] c=new int[n-n/2];
        merge(a,b,c);
        for(int ele:b){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int d:c){
         System.out.print(d+" ");
        }
    }
    public static void merge(int[] a,int[] b, int[] c){
        int i=0,j=0,k=0;
          while(i<a.length/2){
            b[j]=a[i];
            i++;
            j++;
          }
          while(i>=a.length/2 &&i<a.length){
            c[k]=a[i];
            k++;
            i++;

          }

    }

    
}
