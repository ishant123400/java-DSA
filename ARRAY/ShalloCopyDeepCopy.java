package ARRAY;
import java.util.Arrays;
public class ShalloCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr={2,3,232,24,323};
        int[] x=arr;//iska mtlb x is the shallo copy of arr
        x[2]=10000;
        System.out.println(arr[2]);
    
//deep copy
int[] y=Arrays.copyOf(arr,arr.length);
y[0]=100;
System.out.println(y[0]);
System.out.println(arr[0]);}

    
}
