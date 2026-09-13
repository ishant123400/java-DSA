import java.util.Scanner;
class count_the_digit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==0) n=5;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
}