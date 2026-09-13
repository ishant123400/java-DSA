package MultiDimensionalArrays;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2); a.add(3); a.add(5);
         ArrayList<Integer> b=new ArrayList<>();
         b.add(43); b.add(73);
          ArrayList<Integer> c=new ArrayList<>();
        c.add(23); c.add(33); c.add(51);
        b.add(32);
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
       // System.out.println(arr);

    //    for(int i=0;i<arr.size();i++){
    //     for(int j=0;j<arr.get(i).size();j++){
    //          System.out.print(arr.get(i).get(j)+" ");
    //     }
    //     System.out.println();
    //    }


    //if we add new arraylaist
    arr.add(new ArrayList<>());

    // if we add element in new arraylist
    arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);
    for(ArrayList<Integer> list:arr){
        for(int ele:list){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
        }
    
}
