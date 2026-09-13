package Recurison;
import java.util.Scanner;
public class LookAndSayPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String ans= countandsay(n);
       System.out.println(ans);
    }
    public static String countandsay(int n){
        if(n==1) return "1";
         String s=countandsay(n-1);
         String ans="";
         int i=0,j=0;
         while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
         }
         int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                return ans;

    }
    
}
