import java.util.Scanner;
class GP_terms{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int a=1,r=2;
       for (int i=1;i<=n;i++){
       System.out.print(a+" ");
       a=a*r;
       }
       
    }
}