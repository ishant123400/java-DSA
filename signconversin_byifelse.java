
import java.util.Scanner;
public class signconversin_byifelse{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("enter no=");
    int x = sc.nextInt();
    if (x>90) x=-x;
    System.out.println(x);
    
}}