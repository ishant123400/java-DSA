import java.util.Scanner;
public class signcoversion_inoneline{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("enter no=");
    int x = sc.nextInt();
    if (x>0) x=-x;
    System.out.println(x);
    
}}
