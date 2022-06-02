import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str,"");
    }
    public static void printEncodings(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }else if(ques.length()==1){
            char ch = ques.charAt(0);
            if(ch=='0'){
                return;
            }
            int chv = ch - '0';
            char code = (char)('a' + chv -1);
            System.out.println(ans + code);
        }else{
            // only one character case
            char ch = ques.charAt(0);
            String ros1 = ques.substring(1);
            if(ch=='0'){
                return;
            }else {
                int chv = ch - '0';
                char code = (char) ('a' + chv-1);
                printEncodings(ros1, ans + code);
            }
            // two character case
            String ch12 = ques.substring(0,2);
            String ros2 = ques.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if(ch12v<=26) {
                char code = (char)('a' + ch12v-1);
                printEncodings(ros2, ans + code);
            }
        }
    }
}
