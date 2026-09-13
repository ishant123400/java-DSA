package MultiDimensionalArrays;

public class MinimumElementOutOfAllMaxElementOfEachRow {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int row=-1;
        int[][]arr={{2,3,1,97,2},{32,23,1,3,3},{2,3,4,56,4}};
    System.out.println(arr.length+" "+arr[0].length);
    for(int i=0;i<arr.length;i++){
        int max=Integer.MIN_VALUE;
        for(int j=0;j<arr[0].length;j++){
            if(max<arr[i][j]){
                max=arr[i][j];
            }}
            if(max<min){
                min=max;
                row=i;
            }
          
            
        }
        

    System.out.println(row+" "+min);
    }
    
}
