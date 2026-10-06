package Stacks;

import org.w3c.dom.Node;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek() throws Exception{
        if(head==null){
             throw new Exception("stack underflow error ❤️");
            //  System.out.println("stack is empty");
            // return -1;
        }
        return head.val;
    }
    int pop(){
        if(head==null) {
            System.out.println("stack is empty");
        return -1;
    }
    else{
        int x=head.val;
         head=head.next;
         len--;
         return x;

    }
}
    void push(int ele){//add at head
        Node temp=new Node(ele);
        if(len==0) head=temp;
        else{
           temp.next=head;
           head=temp;
        }
        len++;

    }
    int size(){
        return len;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    
}
public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception {
        MyStack st=new MyStack();
        st.peek();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.display();
        st.pop();
        System.out.println();
        st.display();
        st.push(100);
        System.out.println();
        st.display();
        st.size();
        System.out.println();
        st.display();
        st.peek();
        System.out.println();
        st.display();
    }
    
    
}
