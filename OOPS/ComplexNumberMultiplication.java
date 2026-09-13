package OOPS;
class complex{
    double x;
    double y;
    complex(){

    }
    complex(double x,double y){
        this.x=x;
        this.y=y;
    }
      void print(){
        if(y>=0){
        System.out.println(x+" + "+y+"i");}
        else {
            System.out.println(x+" - "+-y+"i");
        }
    }
    void multiply(complex z){
          x=x*z.x-y*z.y;
          y=x*z.y+y*z.x;
    }
    void divide(complex z2){
        this.x=(x*z2.x+y*z2.y)/((z2.x*z2.x)+(z2.y*z2.y));
            this.y=(y*z2.y-x*z2.y)/((z2.x*z2.x)+(z2.y*z2.y));
    }
}
public class ComplexNumberMultiplication {
    public static void main(String[] args) {
      complex z1=new complex(5,-1);
        complex z2=new complex(4,4);
        z1.print();
        z2.print();
        System.out.println("multiplication");
        z2.multiply(z1);
        z1.print();
        z2.print();
        System.out.println("division");
        z1.divide(z2);
        z1.print();
        z2.print();


}
}