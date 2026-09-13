import java.util.Scanner;
class Question2 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter x=");
        double x=sc.nextDouble();
        System.out.print("enter y=");
        double y=sc.nextDouble();
        if (y>0 && x>0) System.out.println("x , y lie in 1st quad");
        else if (y>0 && x<0) System.out.println("x,y is lie in 2nd quad");
        else if (y<0 && x<0) System.out.println("x,y lie in 3rd quar");
        else if (x>0 && y<0) System.out.println("x,y lie in 4th quad");
        else if (y==0 ) System.out.println(" point lie on x axis");
        else if (x==0) System.out.println("lie on y axis");
        else System.out.println("point not defined");

    }
}