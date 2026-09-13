package OOPS;
  class cricketer{
    static String country="india";
    int runs;
    double avg;
    cricketer(int runs,double avg){
        this.runs=runs;
        this.avg=avg;
    }
    void print(){
        System.out.println(runs+" "+avg);
    }
    static void greet(){
         System.out.println("ishant");
    }
  }
public class FinalAndStatic {
    public static void main(String[] args) {
        cricketer c1=new cricketer(200,2.2);
        cricketer.greet();
         c1.country="nz";
        System.out.println(cricketer.country);
        cricketer c2=new cricketer(100,1.2);
        System.out.println(c2.country);
        c1.print();
        c2.print();
        
    }
}
