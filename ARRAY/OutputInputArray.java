package ARRAY;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
    //     int [] a={21,323,434,12,34,23};
    //    int n=a.length;
    //     for(int i=0;i<n;i++){
    //         System.out.print(a[i]+"  ");
    //     }

    int [] x=new int[7];
    // default value
    // for(int i=0;i<7;i++)
    // System.out.print(x[i]+" ");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<7;i++){
        x[i]=sc.nextInt();
        System.out.print(2*x[i]+" ");
    }

    }
    
}
