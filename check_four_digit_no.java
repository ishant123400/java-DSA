import java.util.Scanner;
public class check_four_digit_no {
public static void main(String[] args){
    Scanner ishant=new Scanner (System.in);
    System.out.print("enter no:");
    double x=ishant.nextDouble();
    if (999<x && x<10000) System.out.println("the no. is 4 digit");
    else System.out.println("the no. is not four digit");

}    
    
}
