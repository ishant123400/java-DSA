package ARRAY;

public class SelectionSort2 {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int []a={1,-4,-3,5,2,4,5,54};
        int n=a.length;
        print(a);
        System.out.println();
        for(int i=n-1;i>=0;i--){
            int max=Integer.MIN_VALUE ,m=0;
            for(int j=0;j<=i;j++){
                if(a[j]>max){
                    max=a[j];
                    m=j;
                }}
                int temp=a[i];
                a[i]=a[m];
             a[m]=temp;
            
        }
        print(a);
    }
    
}
