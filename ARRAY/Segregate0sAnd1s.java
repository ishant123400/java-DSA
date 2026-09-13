package ARRAY;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int [] arr={1,0,0,0,0,0,1,1,1,1};
        //two pass solution
        // int cout=0;
        // int sout=0;
        //two pass solution
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0) cout++;
        //     else sout++;
        // }
        // for(int i=0;i<cout;i++){
        //     arr[i]=0;
        // }
        // for(int i=cout;i<arr.length;i++){
        //     arr[i]=1;
        // }
        


        //one pass solution
          int n=arr.length;
          int i=0,j=n-1;
          while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0) {
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;}
          }
    }
    
}
