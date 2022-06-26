import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook  = new HashMap<>();
        phonebook.put("Nav",6758);
        phonebook.put("Vish",32109);
        phonebook.put("Anna",2387);
        phonebook.put("Pooja",23627);
        System.out.println(phonebook);
        System.out.println(phonebook.get("Anna"));
        System.out.println(phonebook.get("Pooja"));
        Set<String> keys = phonebook.keySet();
        for (String k:keys) {
            System.out.print(k+ ":" + phonebook.get(k) + " ,");
        }
        phonebook.put("Anna",2381923);
        System.out.println();
        System.out.println(phonebook);
        phonebook.replace("Vish",0);
        System.out.println(phonebook);
        phonebook.remove("Anna");
        System.out.println(phonebook);
        Set<Map.Entry<String, Integer>> entries = phonebook.entrySet();
        for(Map.Entry<String, Integer> entry: entries ){
            System.out.println(entry.getKey() + ":" + entry.getValue());
            entry.setValue(0);
        }
        System.out.println(phonebook);
    }
}
