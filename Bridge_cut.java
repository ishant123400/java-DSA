import java.util.Scanner;
public class Bridge_cut {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
        for(int j=1;j<=n*2-1;j++){
            System.out.print("* ");
        }
        System.out.println();
        int y=1;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=y;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");}
                y+=2;
                System.out.println();
        }
       
     }
    }
    

