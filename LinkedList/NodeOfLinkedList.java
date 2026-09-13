package LinkedList;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
  
}
public class NodeOfLinkedList {
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        node d=new node(40);
        node e=new node(50);
        //connect karenge (link the node)
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(c);  //address
        System.out.println(b.next); //address
        System.out.println(a.next.next); //address
    }
    
}
