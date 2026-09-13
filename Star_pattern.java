import java.util.Scanner;
class Star_pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==(row/2)+1||j==(col/2)+1)
                    System.out.print("* ");
                    else System.out.print("  ");
                    
                }System.out.println();
        }

    }
}

