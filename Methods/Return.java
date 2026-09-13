package Methods;

public class Return {
    // public static int ishu(int a){
    //     System.out.println("ishant singh");
    //     if(a>0)
    //     return 5;
    // else return 10;
    // }
    // public static void main(String[] args){
    //     ishu(-2);
    //     System.out.println(5+ishu(-2));
    // }
    public static int max(int a, int b, int c){
        if(a>=b&&a>=c) return a;
        else if(b>=a&&b>=c) return b;
        else return c;
    }
    public static void main(String[] args){
        System.out.println(max(7,337,2673));
    }
}
