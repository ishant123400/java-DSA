package MultiDimensionalArrays;

public class OutputIn2DArray {
    public static void main(String[] args) {
    //int[][]arr=new int[10][10];
    int[][]arr={{2,3,1,4,2},{32,23,1,3,3},{2,3,4,56,4}};
    System.out.println(arr.length+" "+arr[0].length);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    
}}
