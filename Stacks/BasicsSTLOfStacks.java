package Stacks;
import java.util.Stack;
public class BasicsSTLOfStacks {

    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        System.out.println(st.isEmpty());
        // orr
        System.out.println(st.size()==0);
        st.push("ishu");
        st.push("singh");
        st.push("isha");
        st.push("preet");
        st.push("aniket");
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st); // AS=0(n);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it return the top most ele and then remove
        System.out.println(st);

    }
    
}
    

