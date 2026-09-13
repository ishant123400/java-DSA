package Recurison;

// public class GlobalVariable {
//     static int x=100;
//     public static void main(String[] args) {
//         x=10;
//         int x=7;//ye main ka local variable hai is liye
//         System.out.println("x====="+x);
//         // fun();
//         System.out.println(x);

//     }
//     public static void fun(){
//     x=90;
// }
    
// }


//or

public class GlobalVariable {
    static int x=100;
    public static void main(String[] args) {
        System.out.println("x====="+x);
        fun();
        System.out.println(x);

    }
    public static void fun(){
    x=90;
    int x=80;
    System.out.println(x);
}
    
}
