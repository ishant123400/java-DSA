package Recurison;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GenerateParenthesis {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<String> list=new ArrayList<>();
    generate("",n,0,0,list);
    System.out.println(list);
    
}
public static void generate(String s,int n,int l, int r, List<String> list){
      if(r==n) {
        list.add(s);
        return ;
      }

    if(l<n)  generate(s+"(", n, l+1, r, list);
    if(r<l)  generate(s+")",n,l,r+1,list);
    
}
}