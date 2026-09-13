import java.util.Scanner;
class Ternary_operators_nested_ifelse{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("a:");
        double a=sc.nextDouble();
         System.out.print("b:");
         double b=sc.nextDouble();
          System.out.print("c;");
          double c=sc.nextDouble();
          double largest= (a>b) ? ((a>c) ? a: c) : ((b>c) ? b :c );
           System.out.println("largest value is="+largest);}}