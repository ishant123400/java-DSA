import java.util.Scanner;
class check_prime_and_composite{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                {flag=false;
            break;
        }}
if(n==1)System.out.print("no.is not prime and composite");
else if(flag==false)System.out.print("composite no.");
else System.out.print("prime no.");
    }
}