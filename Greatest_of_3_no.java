import java.util.Scanner;
class Greatest_of_3_no{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("a=");
        double a=sc.nextDouble();
        System.out.print("b=");
        double b=sc.nextDouble();
        System.out.print("c=");
        double c=sc.nextDouble();
        if (a>=b && b>=c) System.out.println("a is greater");
        else if (b>=c && c>=a) System.out.println("b is greater");
        else System.out.println("c is greater");
    }
}