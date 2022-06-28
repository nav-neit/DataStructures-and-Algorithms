import java.util.HashMap;
import java.util.Scanner;
public class HighiestFrequencyCharacter {
    public static char hfc(String str){
        char ch = '?';
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0) + 1);
        }
        int maxfreq = -1;
        for (char c: hm.keySet()) {
            if(hm.get(c) > maxfreq){
                ch = c;
                maxfreq = hm.get(c);
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = hfc(str);
        System.out.println(ch);
    }
}
