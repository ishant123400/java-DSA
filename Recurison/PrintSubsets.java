package Recurison;
import java.util.ArrayList;
public class PrintSubsets {
    public static void main(String[] args) {
     String s="abc";
     ArrayList<String> list=new ArrayList<>();
     substring("",s,0,list);
     System.out.println(list);
}
public static void substring(String ans,String s,int idx,ArrayList<String> list){
    if(idx==s.length()){
        if(ans.length()!=0)list.add(ans);
        return;
    }
    char ch=s.charAt(idx);
    substring(ans+ch,s,idx+1,list);
    substring(ans,s,idx+1,list);
}
}