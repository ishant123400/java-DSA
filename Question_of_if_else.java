import java.util.Scanner;
class Question_of_if_else{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
         System.out.print("enter no:");
         double x=sc.nextDouble();
         if (x%3==0) System.out.println("divisible by 3:");
         if (x%5==0)  System.out.println("divisible by 5:");
         if (x%3==0 && x%5==0)  System.out.println("divisible by 5 and 3 both");
         else  System.out.println("not divisible");
         

    }

}
