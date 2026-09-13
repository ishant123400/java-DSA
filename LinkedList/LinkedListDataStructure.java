package LinkedList;
import java.util.Scanner;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
 class Linkedlist{
    Node head;
    Node tail;
    int size;
    int get(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
        

    }
   void addAtHead(int val) {
       Node temp=new Node(val);// jbb add karegnge tbb new node banayenge 
       if(temp==null) head=tail=temp;
       else{
        temp.next=head;
        head=temp;
       }
       size++;

}
    void addAtTail(int val){
        Node temp=new Node(val);// jbb add karegnge tbb new node banayenge 
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null) {System.out.println("linkedlist is already empty");
            return;
        }
        else{
            head=head.next;
        }
        if(head==null) tail=null;
        size--;
    }
    void insert(int  val, int idx) {
           if(idx<0||idx>size) System.out.println("invalid index!");
           else if(idx==0) addAtHead(val);
           else if(idx==size) addAtTail(val);
           else{
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;

           }
   }
    void delete(int idx){
        if(idx>=size||idx<0) System.out.println("invalid index!");
        else if(idx==0) deleteAtHead();
        else { 
            Node temp=head;
            for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1) tail=temp;
            size--;
        
    }
    }
     void display() {
       if(head==null) return;
       Node temp=head;
       while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
       }
       System.out.println();
     }}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();
        ll.addAtHead(5);
         ll.display();
         ll.deleteAtHead();
         ll.display();
         System.out.println(ll.size);
         ll.insert(35,3);
         ll.display();
         System.out.println(ll.get(4));
         ll.delete(sc.nextInt());
         ll.display();

    }
    
}
