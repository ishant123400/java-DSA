package OOPS;
import java.util.Scanner;
public class UserDefinedDataTypes {
    public static class Students{
        String name;
        int roll;
        double cgpa;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        Students s1=new Students();
        s1.name="Ishant Singh";
        //  input kaise le
        s1.roll=sc.nextInt();
        s1.cgpa=8.01;

        Students s2=new Students();

        s2.name="singh";
        s2.roll=51;
        s2.cgpa=2.2;
        System.out.println(s1.name+" roll-"+s1.roll+" cgpa-"+s1.cgpa);
      System.out.println(s2.name+" roll-"+s2.roll+" cgpa-"+s2.cgpa);

      //if we change 
      s2.cgpa=3.3;
       System.out.print(s2.name+" roll-"+s2.roll+" cgpa-"+s2.cgpa);
    }
    }
    

