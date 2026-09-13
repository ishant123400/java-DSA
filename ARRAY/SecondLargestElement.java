package ARRAY;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr={-3,-2,-4,-7,-5,-8,-9,-10};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max)
                     max=arr[i];
                }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>smax && arr[i]!=max)
                    smax=arr[i];
                
                }
                  System.out.println("largets element="+max);
                System.out.println("second largest element=="+smax);
                
            
        }
        
    }
    

