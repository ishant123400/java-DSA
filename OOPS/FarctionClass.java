package OOPS;
class faraction{
    int num;
    int deno;
    faraction(){

    }
    faraction(int num,int deno){
        this.num=num;
        this.deno=deno;
        simplify();
    }
    void print(){
        System.out.println(num+" / "+deno);
    }
   void Addition(faraction f){
            num=num*f.deno+f.num*deno;
            deno=deno*f.deno;
            simplify();
    }
    void multiply(faraction f){
        num=num*f.num;
        deno=deno*f.deno;
        simplify();
    }
    void divide(faraction f){
          num=num*f.deno;
          deno=deno*f.num; 
          simplify();
    }
     void simplify(){
         boolean IsNegative=(num*deno<0) ? true:false;
         num=Math.abs(num);
         deno=Math.abs(deno);
        int gcd=hcf(num,deno);
        num=num/gcd;
        deno=deno/gcd;
        if(IsNegative) num=-num;
      }
      int hcf(int a,int b){
          if(a==0) return b;
          return hcf(b%a,a);
      }
}
public class FarctionClass {
    public static void main(String[] args) {
        faraction f1=new faraction(3,-7);
        faraction f2= new faraction(7,-3);
        f1.print();
        f2.print();
        System.out.println("Addition");
        f1.Addition(f2);
        f1.print();
        System.out.println("multiplication");
        f1.multiply(f2);
        f1.print();
        System.out.println("division");
        f1.divide(f2);
        f1.print();
        faraction f3=new faraction (3,3);
        f3.print();
    }
    
}
