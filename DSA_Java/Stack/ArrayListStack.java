import java.util.ArrayList;

public class ArrayListStack {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return-1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void disp(ArrayList<Integer> st){
        for (int i = 0; i < st.size(); i++) {
            System.out.print(st.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        disp(st.list);
        System.out.println(st.pop());
        disp(st.list);
        System.out.println(st.peek());
        System.out.println(st.pop());
        disp(st.list);
    }
}
