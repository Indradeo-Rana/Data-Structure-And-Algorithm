package String;

import java.util.Arrays;

public class CntDuplicates {
    static void pass1(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j])
                    count++;
                else {
                    if(count>1)
                    System.out.println(ch[i] + " = " + count);
                    i = j;
                    count=1;
                }
            }
        }

    }

    static void pass2(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                System.out.println((char) (i + 'a') + " = " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        pass1(str); // using sort and count frequency
        pass2(str);
    }
}
