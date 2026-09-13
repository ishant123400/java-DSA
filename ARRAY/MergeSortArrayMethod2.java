package ARRAY;

public class MergeSortArrayMethod2 {
    public static void main(String[] args) {
        int[]a={2,4,3,5,6};
        int[]b={6,7,8,9};
        int[]c=new int[a.length+b.length];
        merge(c,a,b);
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
    public static void merge(int[]c,int[]a,int[]b){
        int i=a.length-1;
        int j=b.length-1;
        int k=c.length-1;
        while (i>=0&&j>=0) {
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
                k--;
            }
            else{
                c[k]=b[j];
                j--;
                k--;
            }}
               while(i>=0){
                c[k]=a[i];
            i--;
        k--;  }
            while(j>=0){
                c[k]=b[j];
            j--;
        k--;            }
            
        
    }
    
}
