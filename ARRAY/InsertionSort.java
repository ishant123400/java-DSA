package ARRAY;

public class InsertionSort {
    public static void main(String[] args) {
        int []a={1,4,5,6,53,-2};
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0&&a[j]<a[j-1]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        for(int ele:a){
        System.out.print(ele+" ");

        }
    }
    
}
