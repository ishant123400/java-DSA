package LinkedList;
 class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
 }
 class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;

    }
    void insertAtTail(int val){
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;;
            tail=temp;
        }
        size++;

    }
    void insertAtIdx(int idx,int val){
        if(idx>=size || idx<0 ) {
            System.out.println("invalid idx");
        return;
    }
        if(idx==size){
             insertAtTail(val);
            }
        else if (idx==0) {
            insertAtHead(val);
        }
        else {
            ListNode temp=head;
            ListNode a=new ListNode(val);
            for(int i=0;i<idx-1;i++){
               temp=temp.next;
            }
            ListNode b=temp.next;
            temp.next=a;
            a.prev=temp;
            a.next=b;
            b.prev=a;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0) {
            System.out.println("list is empty!");
        }
        if(size==1){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
       void deleteAtTail(){
        if(size==0) {
            System.out.println("list is empty!");
        }
        if(size==1){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void reversedisplay(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

 }
public class DoublyLinkedListClass {
    public static void main(String[] args) {
         DLL list=new DLL();
         list.insertAtHead(10);
         list.insertAtHead(20);
         list.insertAtHead(30);
         list.insertAtHead(40);
         list.insertAtHead(50);
         list.display();
         list.insertAtTail(60);
         list.display();
        //  list.reversedisplay();
        list.deleteAtHead();
        // list.display();
        list.deleteAtTail();
        list.display();
        list.insertAtIdx(2,25);
        list.display();

        

    }
    
}
