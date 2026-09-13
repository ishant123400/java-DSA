package MultiDimensionalArrays;

public class SumOf2DArray {
    public static void main(String[] args) {
        int sum=0;
        int[][]arr={{2,3,1,4,2},{32,23,1,3,3},{2,3,4,56,4}};
    System.out.println(arr.length+" "+arr[0].length);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            sum=sum+arr[i][j];
    }}
    System.out.println(sum);
    
    
}}
