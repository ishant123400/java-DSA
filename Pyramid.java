import java.util.Scanner;
public class Pyramid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n-1,y=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=x;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=y;j++){
                System.out.print("* ");
            }
            x--;
            y+=2;
            System.out.println();
        }
    }
    
}
