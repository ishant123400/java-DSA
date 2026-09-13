package STRING;
import java.util.Scanner;
public class PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        int i=0,j=A.length()-1;
        while(i<=j){
            if(A.charAt(i)==A.charAt(j)) System.out.println("true");
            else System.out.println("false");
            break;
        }
    }
    
}
