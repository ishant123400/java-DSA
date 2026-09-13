package Methods;

public class PassByValueAndRefrence {
    public static void Change(int a){
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        Change(5);
        System.out.println(a);
    }
    
}
