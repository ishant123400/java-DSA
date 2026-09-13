package Recurison;

public class FunctionCallingItself {
     public static void main(String[] args) {
        
    //     ishant(1);
    // }
    // public static void ishant(int n){
    //     if(n==10) return;
    //     System.out.println("ishant");
    //    ishant(n+1);


    // print(5);
    // } 
    // public static void print(int n){
    //     if(n==0) return; 
    //     System.out.println(n);
    //     print(n-1);


        //or
        print(1);

    }
    public static void print(int n){
        if(n==21) return;
        System.out.println(n);
        print(n+1);
    }
   
}
