import java.util.*;

public class Keypadcombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> words = getKpc(str);
        System.out.println(words);
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKpc(String str){
        if(str.length() == 0){
            return new ArrayList<>(){{add(" ");}};
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKpc(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (int i = 0; i < codes[ch-'0'].length(); i++) {
            char chcode = codes[ch - '0'].charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }

}
