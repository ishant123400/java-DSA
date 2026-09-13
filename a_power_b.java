import java.util.Scanner;
class a_power_b{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=1;
        for(int i=1;i<=b;i++){
            p=p*a;
        }
        System.out.print(a+ " raise to the power "+b+" ==  "+p);
    }
}