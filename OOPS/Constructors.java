package OOPS;

public class Constructors {
    static class car{
        String name;
        int seat;
        double length;
        car(){ //default constructors

        }
        car(String name,int seat,double length){
            this.name=name;
             this.seat=seat;
             this.length=length;
        }
        car(int l,String m,double n){
             name=m;
             seat=l;
             length=n;
        }
         void print(){
            int seat=10;
            String name="ishant";
            System.out.println(this.name+" "+this.seat+" "+length);
        }
    }
    public static void main(String [] args){
        car c1=new car("alto",4,4.99);
        c1.print();
        car c2=new car(6,"thar",5.99);
         c2.print();
         car c3=new car();//default constructor ki wajah se ham use kr paa rahe hai
         c3.name="honda city";

    }
    
}
