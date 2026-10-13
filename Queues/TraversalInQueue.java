package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {
    private static void display(Queue<Integer> q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
            Queue<Integer> q=new LinkedList<>();
            q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);q.add(60);
                  display(q);
                  addAtIndex(q,3,35);
                  display(q);
                  peek(q,3);
                  removeAtIndex(q,3);
                  display(q);
        }
        private static void removeAtIndex(Queue<Integer> q, int idx) {
            if(idx<0 || idx>=q.size()){
                System.out.println("invalid idx");
                return;
            }
               int n=q.size();
               for(int i=0;i<idx;i++){
                q.add(q.remove());
               }
               q.remove();
               for(int i=0;i<n-idx-1;i++){
                q.add(q.remove());
               }
    }
        private static void peek(Queue<Integer> q, int idx) {
            if(idx<0 || idx>=q.size()){
                System.out.println("invalid idx");
                return;
            }
            int n=q.size();
            for(int i=0;i<n;i++){
                int x=q.remove();
                if(idx==i) System.out.println(x);
                q.add(x);
            }

    }
        private static void addAtIndex(Queue<Integer> q,int idx, int val) {
             if(idx<0 || idx>=q.size()){
                System.out.println("invalid idx");
                return;
            }
            int n=q.size();
            if(idx==n-1) {
                q.add(val); 
                return;}
                 for(int i=0;i<idx;i++){
                    q.add(q.remove());
                 }
                 q.add(val);
                 for(int i=0;i<n-idx;i++){
                    q.add(q.remove());
                 }
        }
    
    
}
