package BinaryTrees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
      this.val=val;
    }
}
  class quad{
    int min;
    int max;
    int sum;
    int level;
    quad(int max,int min,int sum,int level){
          this.max=max;
          this.min=min;
          this.sum=sum;
          this.level=level;
    }
  }
public class MinMAxLevelSum {
    public static void main(String [] args){
           //    4
        //     /   \
        //   2      6
        //  / \    / \
        // 1   3  5   9 
        Node a=new Node(4);
        Node b=new Node(2);
        Node c=new Node(6);
        Node d=new Node(1);
        Node e=new Node(3);
        Node f=new Node(5);
        Node g=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g; 
        quad q=calculate(a);
        System.out.print(q.max+" "+q.min+" "+q.sum+" "+q.level);
        
    }

    private static quad calculate(Node root){
       if(root==null) return new quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
       quad lst=calculate(root.left);
       quad rst=calculate(root.right);
       int sum=root.val+lst.sum+rst.sum;
       int max=Math.max(root.val,Math.max(lst.max,rst.max));
       int min=Math.min(root.val,Math.min(lst.min,rst.min));
       int level=1+Math.max(lst.level,rst.level);
        return new quad(max,min,sum,level);



    }
    
}
