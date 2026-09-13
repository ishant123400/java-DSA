package Methods;

public class Arguments {
//     public static void  sum(int a, int b){
//         System.out.println(a+b);
//     }
//     public static void main(String [] args){
//         sum(6,8);
//     }
    
public static void max(int a, int b, int c){
    if(a>=b&&a>=c)
    System.out.println(a);
    if(b>=a&&b>=c)
        System.out.println(b);
    if(c>=a&&c>=b)
        System.out.println(c);
}
public static void main(String[] args){
    max(8,74,9);
}




}
