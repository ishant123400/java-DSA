package OOPS;
//
// ADDITION AND SUBTRACTION
// 
// 
 class complexnumber{
    int x;
    int y;
    complexnumber(int x,int y){
        this.x=x;
        this.y=y;
    }
        complexnumber(){}
    void print(){
        if(y>=0){
        System.out.println(x+" + "+y+"i");}
        else {
            System.out.println(x+" - "+-y+"i");
        }
    }
        void add(complexnumber z2){
            this.x=x+z2.x;
            this.y=y+z2.y;
        }
        void sub(complexnumber z2){
                this.x=x-z2.x;
                this.y=y-z2.y;
        }
    
    
 }
public class ComplexNumberClass {
    public static void main(String[] args) {
        complexnumber z1=new complexnumber(2,5);
        complexnumber z2=new complexnumber(5,-2);
        z1.print();
        z2.print();
        z1.add(z2);
        System.out.println("Addition");
        z1.print();
        z2.print();
        z1.sub(z2);
        System.out.println("subtraction");
        z1.print();
        z2.print();
        }
    
}
