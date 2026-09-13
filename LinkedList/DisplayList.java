package LinkedList;
import java.util.Scanner;
// class node{
//     int val;
//     node next;
//     node(int val){
//         this.val=val;
//     }
// }
public class DisplayList {
    public static void display(node head){
         node temp=head;
         while(temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;//very imp
         }
        // for(node temp=head;temp!=null;temp=temp.next){
        //     System.out.print(temp.val+" ");
        // }
         System.out.println();
     }
     //display element recursively
     public static void displayrec(node head){
        if(head==null) return;
        displayrec(head.next);//reverse print krta hai
        System.out.print(head.val+" ");
        // displayrec(head.next);// seeda print karega
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a=new node(10);
        node b=new node(20);
        node c=new node(sc.nextInt());
        node d=new node(sc.nextInt());
        node e=new node(sc.nextInt());
        //connect karenge (link the node)
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        displayrec(a);
      
        // get fxn use to particular idx ele
        System.out.println(get(a,3));
    }
         private static int get(node head,int idx){
            node temp=head;
            for(int i=0;i<idx;i++){
                head=head.next;
            }
            return head.val;

         }

}