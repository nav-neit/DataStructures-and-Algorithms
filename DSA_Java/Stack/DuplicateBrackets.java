import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static boolean duplicatebrackets(String str){
        Stack<Character> s = new Stack<Character>();
        s.push(str.charAt(0));
        for(int i = 1;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=')') {
                s.push(ch);
            }else{
                if(s.peek()=='('){
                    return true;
                }
                while(s.peek()!='('){
                    s.pop();
                }
                s.pop();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "(a+b)(c+d)(e+f)";
        System.out.println(duplicatebrackets(str));
    }
}
