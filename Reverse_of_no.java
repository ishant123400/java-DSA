import java.util.Scanner;
class Reverse_of_no{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,rev=0;
        while(n!=0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        System.out.println(rev);

    }
}