package Methods;
import java.util.Scanner;

public class PermutationAndCombination {
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int r=sc.nextInt();
        
    //     // nCr=n!/r!*(n-r)!
    //     // nPr=n!/r!
    //     int Nfact=1;
    //     for(int i=1;i<=n;i++){
    //         Nfact=Nfact*i;
    //     }
    //     int Rfact=1;
    //     for(int i=1;i<=r;i++){
    //         Rfact*=i;
    //     }
    //     int NminusRfact=1;
    //     for(int i=1;i<=n-r;i++){
    //         NminusRfact*=i;
    //     }
    //     System.out.println(Nfact/(Rfact*NminusRfact));



    // }


    //SECOND BEST METHOD❤️❤️
    public static int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nCr=fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
    }
}
