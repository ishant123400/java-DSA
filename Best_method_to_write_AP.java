import java.util.Scanner;
public class Best_method_to_write_AP {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        // ap of 2,6,10,14,....
        int a=2 , d = 4 ;
        for(int i=1 ; i<=n ; i++){
            System.out.print(a+" ");
            a+=d;

        }
    }
    
}
