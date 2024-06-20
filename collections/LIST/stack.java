import java.util.Stack;
import java.util.Iterator;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop();
        System.out.println(st);
        Iterator itr= st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
