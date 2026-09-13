package ARRAY;
public class MergeSortArray {
    public static void main(String[] args) {
        int []a={2,43,23,3,43,2,1};
        int []b={1,4,5,2,3,4,5,4,3};
        int []c=new int[a.length+b.length];
        System.out.println();
        merge(a,b,c);
        
        for(int ele:c) System.out.print(ele+" ");

    }
    public static void merge(int [] a,int[] b,int[]c) {
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }
            //iska mtlb a ke saare element khatam ho gya hai abb b ke bache hue element lo
              while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
              }
            
            
                while(i<a.length){
                    c[k]=a[i];
                    k++;
                    i++;}
                }
              
            
    }}
          
    
    

