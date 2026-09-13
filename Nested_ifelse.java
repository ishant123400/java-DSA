import java.util.Scanner;
class Nested_ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("a=");
        double a=sc.nextDouble();
        System.out.print("b=");
        double b=sc.nextDouble();
        System.out.print("c=");
        double c=sc.nextDouble();
        if (a>b) {
            if (a>c) System.out.println("a");
            else System.out.println("c"); //c>a
        } else {
            if (b>c) System.out.println("b");//b>a
            else System.out.println("c");//c>b
        }
    }
}