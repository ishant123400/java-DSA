package OOPS;

public class PassingClassesToMethods {
    public static class car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        //if we print using method
         void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
         }
    }
    public static void main(String [] args){
         car c1=new car();
         c1.seats=4;
         c1.name="thar";
         c1.length=3.99;
         c1.type="XUV";
         c1.torque=200;

         car c2=new car();
         c2.seats=5;
         c2.name="fortuner";
         c2.length=4.99;
         c2.type="XUV";
         c2.torque=700;
        
         //if we change
         change(c1);
         System.out.println(c1.torque);
         c1.print();
         c2.print();

    }
    public static void change(car c1){
        c1.torque=500;
    }
    
}
