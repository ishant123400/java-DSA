package ARRAY;
import java.util.Arrays;
public class QuestionOfArray {
    public static void main(String[] args) {
        int [] x={2,3,2,4,2,1};
        for(int i=0;i<x.length;i++){
            if(i%2!=0){
                System.out.print(x[i]*2+" ");
            }
            if(i%2==0){
                System.out.print(x[i]+10 +" ");
            }
            
           
            
            
        }
    }
    
}
