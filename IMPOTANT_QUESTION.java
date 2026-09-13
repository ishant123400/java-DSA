import java.util.Scanner;
class IMPORTANT_QUESTION{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter no:");
        double x=sc.nextDouble();
        if (x%5==0 && x%3==0) System.out.println("the no. is divisible by 5 and 3");
        else if (x%5==0) System.out.println("the no. is divisible only by 5");
        else if (x%3==0) System.out.println("the no. is only divisible by 3 ");
        else System.out.println("the no. is not divisible by 5 and 3");
    }

}