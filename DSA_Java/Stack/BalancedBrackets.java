import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean handleclosing(Stack<Character> s, char ch){
        if(s.isEmpty()) {
            return false;
        }else if(s.peek()!=ch){
            return false;
        }else{
            s.pop();
            return true;
        }
    }
    public static boolean balancedornot(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='['||ch=='('||ch=='{'){
                s.push(ch);
            }else if(ch=='}'){
                boolean val = handleclosing(s, '{');
                if(val==false){
                    return false;
                }
            }else if(ch==']'){
                boolean val = handleclosing(s, '[');
                if(val==false){
                    return false;
                }
            }else if(ch==')'){
                boolean val =  handleclosing(s, '(');
                if(val==false){
                    return false;
                }
            }
        }
        if(s.isEmpty()){
           return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balancedornot(str));
    }
}
