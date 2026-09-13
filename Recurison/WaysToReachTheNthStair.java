package Recurison;
import java.util.Scanner;
public class WaysToReachTheNthStair {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    stair(n);
    System.out.println(stair(n));
}
public static int stair(int n){
    if(n==1||n==2) return n;
    else return stair(n-1)+stair(n-2);
}
    
}
