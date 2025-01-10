package String.Beginer;

import java.util.HashMap;

public class CharFreq {
    public static void main(String[] args) {
        char[] charArr = { 'a', 'b', 'c', 'a', 'd', 'a', 'c' };

        // first app
        char[] freq = new char[256];
        for (int i = 0; i < charArr.length; i++) {
            freq[charArr[i]]++;
        }
        // for (int c : freq) {
        //     if (c > 0)
        //         //System.out.print(c + " ");
        // }
        // second app
        HashMap<Character, Integer> st = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if (!st.containsKey(charArr[i])) {
                st.put(charArr[i], 1);
            } else {
                int n = st.get(charArr[i]);
                st.put(charArr[i], n + 1);
            }
        }
        for (Character key : st.keySet()) {
            System.out.println(key + ": " + st.get(key));
        }
    }
}
