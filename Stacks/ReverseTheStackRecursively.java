package Stacks;

import java.util.Stack;

public class ReverseTheStackRecursively {
        public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st);
        int ele=80;
        PushAtBottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }

    private static void reverse(Stack<Integer> st) {
           if(st.size()<=1) return;
           int top=st.pop();
           reverse(st);
           PushAtBottom(st,top);
        }

    private static void PushAtBottom(Stack<Integer> st, int ele) {
                  if(st.size()==0){
                    st.push(ele);
                    return; 
                  }
               int top=st.pop();
              PushAtBottom(st,ele);
              st.push(top);


    }
    
}
