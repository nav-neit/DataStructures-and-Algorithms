import java.util.*;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printssq(str, "");
    }
    public static void printssq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printssq(roq, ans + "");
        printssq(roq, ans + ch);
    }
}
