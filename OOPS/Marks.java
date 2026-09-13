package OOPS;
import java.util.Arrays;
public class Marks {
    static class stmarks{
        String name;
        int roll;
        int [] marks;
        stmarks(int s){
            marks=new int[s];
        } 
        stmarks(int []m){
            // marks=m;
            // deep copy when we cannot change the marks
            marks=Arrays.copyOf(m,m.length);
        }
        
    }
    public static void main(String[] args){
        stmarks s1=new stmarks(4);
        int []arr={2,4,3,5};
        stmarks s2=new stmarks(arr);
        s1.marks[0]=20;
        s1.marks[1]=2;
        s1.marks[2]=210;
        s1.marks[3]=200;
        s2.marks[0]=10;// shaloo copy because we can change the marks
        System.out.println(s1.marks[0]+" "+s1.marks[1]+" "+s1.marks[2]+" "+s1.marks[3]);
        System.out.println(arr[0]);
        
        

    }
    
}
