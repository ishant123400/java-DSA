package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
      this.val=val;
    }
}
class pair{
    int level;
    Node node;
    pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
public class HowToImplement {
    public static void main(String[] args) {
        //       3
        //     /   \
        //   4      2
        //  / \    / \
        //-1   1  6   9 
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g; 
        // levelorder(a);
        // levelOrderLineWise(a);
        KthLevel(a,0,2);
        // // display(a);
        // System.out.println();
        // preorder(a);
        // System.out.println();
        // inorder(a);
        // System.out.println();
        // postorder(a);   
        // System.out.println();
        // System.out.println(size(a));
        // System.out.println(sum(a));
        // System.out.println(product(a));
        // System.out.println(max(a));
        // System.out.println(levels(a));
    }
    private static void KthLevel(Node root, int level, int k) {
        if(root==null) return;
        if(level==k){
            System.out.print(root.val+" ");
        }
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }
    private static void levelOrderLineWise(Node root) {
        Queue<pair> q=new LinkedList<>();
           int currlevel=0;
              q.add(new pair(root,0));
              while(q.size()>0){
                pair front=q.remove();
                if(front.level!=currlevel){
                    currlevel++;
                System.out.println();
                }
                System.out.print(front.node.val+" ");
            if(front.node.left!=null) q.add(new pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new pair(front.node.right,front.level+1));
                     
        }
        System.out.println();


        
    }
    private static void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static void preorder(Node root) {
        if(root==null) return;
         System.out.print(root.val+" ");
         preorder(root.left); 
         preorder(root.right);
    }

    private static void inorder(Node root) {
       if(root==null) return;
       inorder(root.left); 
       System.out.print(root.val+" ");
         inorder(root.right);
    }

    private static void postorder(Node root) {
         if(root==null) return;
         postorder(root.left); 
         postorder(root.right);
         System.out.print(root.val+" ");
    }

    private static int levels(Node root) {
        if(root==null) return 0;
        return Math.max(levels(root.left),levels(root.right))+1;
    }

    private static int max(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.right),max(root.left)));
       
    }

    private static int product(Node root) {
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }

    private static int sum(Node root) {
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
        
    }

    private static int size(Node root) {
        if(root==null) return 0;
        int leftsize=size(root.left);
        int rightsize=size(root.right);
        return leftsize+rightsize+1;
       
    }

    private static void display(Node root) {
        if(root==null) return;
         System.out.print(root.val+" ");
         display(root.left); //left ki sari value print krr dega
         display(root.right); //right ki sari value print krr dega
    }
    
}
