package ARRAY;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] x={2,233,-233,-33,243,4};
        print(x);
        Arrays.sort(x);
        print(x);
    }
    public static void print(int[] x){
        for(int i=0;i<x.length;i++){
        System.out.print(x[i]+" ");}
    
    System.out.println();
    
        }
    
}// sort means assending order
