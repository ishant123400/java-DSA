import java.util.Scanner;
public class check_integer {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter no.=");
        double x=sc.nextDouble();//x=8.99
        int y=(int)x;//y=8
        if ((x-y)==0) System.out.println("the no. is integer");//we use (x-(int)y==0) is same
        else System.out.println("the no. is not integer");
    }
    
}
