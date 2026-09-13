package Recurison;
import java.util.Scanner;
public class TowerOfHanoi {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     hanoi(n,'A','B','C');
    // }
    // private static void hanoi(int m,char a,char b,char c){
    //     if(m==0) return;
    //     hanoi(m-1,a,c,b); //n-1 disk from A to B with the help of c
    //     System.out.println(a+"->"+c);//A to C of largest disk
    //     hanoi(m-1,b,a,c);// n-1 disk from B to C with the help of A
    // }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        hanoi(n,'A','B','C');
    }
    private static void hanoi(int n,char a,char b ,char c){
        if(n==0) return ;
        hanoi(n-1,a,c,b);
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c);
    }
    
}
