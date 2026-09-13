import java.util.Scanner;
public class Questionwith_profit_loss {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("CP=");
        double CP=sc.nextDouble();
         System.out.print("SP=");
         double SP=sc.nextDouble();
         if (CP<SP) 
            {System.out.println("seller made profit="+(SP-CP));
             System.out.println("percentage profit="+((SP-CP)*100/CP));   
            }//OR we use if else if else
         if (CP==SP) System.out.println("seller made no profit and no loss="+(CP-SP));
         if (CP>SP){
            System.out.println("seller made loss of="+(CP-SP));
             System.out.println("percentage loss="+((CP-SP)*100/CP));}
        


        

    }
    
}
