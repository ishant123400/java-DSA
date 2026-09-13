import java.util.Scanner;
class Ternary_operator{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("x=");
        double x=sc.nextDouble();
        // ((condition) ? "sach" : "jhoot")
        System.out.println( (x%2==0) ? "even" : "odd");
    }
}