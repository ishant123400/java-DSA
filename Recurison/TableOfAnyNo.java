package Recurison;
import java.util.Scanner;
// public class TableOfAnyNo {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("print table 😭😎👿❤️");
//         print(1,n);
//     }
//     public static void print(int x,int n){
//         if(x>10) return;
//         System.out.println(x*n);
//         print(x+1,n);
//     }
    
// }


//use of gloabal variable
public class TableOfAnyNo {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        System.out.println("print table 😭😎👿❤️");
        print(1);
    }
    public static void print(int x){
        if(x>10) return;
        System.out.println(x*n);
        print(x+1);
    }
    
}