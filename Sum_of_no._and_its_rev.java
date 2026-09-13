import java.util.Scanner;
class Sum_of_no_and_its_rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        while(n!=0){
            rev=rev*10;
            rev=rev+(n%10);
            n=n/10;
        }
        int sum=rev+a;
      System.out.print(sum);
        

    }

    
}