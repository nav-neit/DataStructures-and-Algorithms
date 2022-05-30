import java.util.*;

public class Getsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        ArrayList<String> res = getssq(str);
        System.out.println(res);
    }
    public static ArrayList<String> getssq(String str){

        if(str.length()==0){
            return new ArrayList<String>(){{add(" ");}};
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getssq(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr: rres){
            mres.add(" " + rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }
}
