package String;

import java.util.Map.Entry;
import java.util.HashMap;

// character frequency in order of their occurence
// hello => h-1, e-1, l-2, o-1
public class CharFreqInOrder {
    public static void Printfrequency(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.print((char) (i + 'a'));
                System.out.print(freq[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Printfrequency("takeuforward");
        HashMap<Character, Integer> map = new HashMap<>();
        // String str ="hello";
        String str = "geeksforgeeks";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int n = map.get(ch);
                map.put(ch, n + 1);
            }
        }
        for (Entry<Character, Integer> id : map.entrySet()) {
             System.out.print(id.getKey()+""+id.getValue()+" ");
        }
    }
}
