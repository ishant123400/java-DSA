package Recurison;
import java.util.ArrayList;
public class StringInRecursion {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("ishant");
        arr.add("deepak");
        arr.add("aniket");
        arr.add("ankit");
        System.out.println(arr);
        change(arr);
        System.out.println(arr);

    }
    public static void change(ArrayList<String>  arr){
        arr.add("singh");
    }
}
