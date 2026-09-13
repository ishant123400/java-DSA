package MultiDimensionalArrays;

public class PrintElementInColumnWise {
    public static void main(String[] args) {
        int[][]arr={{2,3,1,4,2},{3,0,1,3,3},{2,3,4,5,4}};
    System.out.println(arr.length+" "+arr[0].length);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
    
        System.out.println();
        }
        System.out.println("PrintElementInColumnWise");
        for(int k=0;k<arr[0].length;k++){
           for(int l=0;l<arr.length;l++){
            System.out.print(arr[l][k]+" ");
           }
           System.out.println();
        }
    }
    
}
