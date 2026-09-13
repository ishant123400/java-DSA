package STRING;

public class PassingStringToMethod {
    public static void change(String x){
        x="utkarsh";
    }
    public static void main(String[] args) {
        String x="raj";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
    
}
