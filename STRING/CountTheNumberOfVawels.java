package STRING;
import java.util.Scanner;
public class CountTheNumberOfVawels {
    public static void main(String[] args) {
        int cout=0;
        String A="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                cout++;
            }
        }
        System.out.println(cout);
    }
    
}
