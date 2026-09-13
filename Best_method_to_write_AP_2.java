// question write n terms of an AP is 5,12,19,.....nth terms
import java.util.Scanner;
class Best_method_to_write_AP_2{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("n=");
        int n = sc.nextInt();
        int a=5 , d=7 ; 
        for( int i=1 ; i<=n ; i++){
            System.out.print(a+ "  ");
            a+=d;
        }
    }
}