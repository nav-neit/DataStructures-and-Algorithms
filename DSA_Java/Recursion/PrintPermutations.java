import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printpermuts(str,"");
    }
    public static void printpermuts(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<ques.length();i++){
            char ch = ques.charAt(i);
            String ros = ques.substring(0,i) + ques.substring(i+1);
            printpermuts(ros, ans + ch);
        }
    }
}
