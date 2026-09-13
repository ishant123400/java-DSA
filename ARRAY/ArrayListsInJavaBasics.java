package ARRAY;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(34);
        arr.add(21);
        arr.add(43);
        System.out.println(arr.get(2));// array element print
        arr.set(3,50);//change array eement
        System.out.println(arr.get(3));
        System.out.println(arr);
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");}
            System.out.println();//prunt all array
        
        for(int ele:arr){
        System.out.print(ele+" ");}
        System.out.println();//print all array
        
        //if we add extra elemet in array
        arr.add(12);
        System.out.print(arr+" ");
        System.out.println();

        //if we add element in between the element
        arr.add(2,100);
        System.out.print(arr+" ");

        //if we remove the element but removing the element from the last
        arr.remove(arr.size()-1);
        System.out.print(arr+" ");
        //reverse the array
        Collections.reverse(arr);
        System.out.print(arr);

    }
    
}
