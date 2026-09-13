import java.util.Scanner;
public class magnitude_check {
public static void main(String[] args){
    Scanner c=new Scanner (System.in);
    System.out.print("enter no:");
    double x=c.nextDouble();
    if (Math.abs(x)<69) System.out.println("the no. is not greater than 69");
    else if (Math.abs(x)==69) System.out.println("equal to 69");
else System.out.println("the no. is greater than 69");
}    
}
