package MultiDimensionalArrays;

public class SnakesPatternInRowWise {
    public static void main(String[] args) {
         int [][]arr={{2,4,3,2},{1,5,4,0},{6,2,8,9}};
         for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
             for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");}
            
             }
             else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
             }
             System.out.println();
         }
           
         
         
    }
    
}
