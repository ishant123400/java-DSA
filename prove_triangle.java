import java.util.Scanner;
public class prove_triangle {
public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("enter 1st side:");
    double x=sc.nextDouble();
     System.out.print("enter 2nd side: ");
    double y = sc.nextDouble();
    System.out.print("enter 3rd side:");
    double z = sc.nextDouble();
    if (x+y>z && y+z>x && z+x>y) System.out.println("this is the side of triangle");
    else System.out.println("this is not a side of triangle");

}
}
