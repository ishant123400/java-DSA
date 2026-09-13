package Recurison;

public class ReverseOfNo {
    public static void main(String[] args){
        int n=8743;
      reverse(n,0);
      System.out.println(reverse(n,0));
    }
    public static int reverse(int n,int r){
       if(n==0) return r;
       return reverse(n/10,r*10+n%10);
    }

    
}

