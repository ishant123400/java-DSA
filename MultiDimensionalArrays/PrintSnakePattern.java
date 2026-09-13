package MultiDimensionalArrays;

public class PrintSnakePattern {
    public static void main(String[] args) {
        int [][]arr={{1,2,4,5,9},{7,8,5,0,2},{3,6,3,2,1},{5,4,3,0,4}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }}
                else {
                    for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
                System.out.println();
        
        }
    }
    
}
