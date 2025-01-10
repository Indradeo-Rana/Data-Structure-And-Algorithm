package String.Beginer;

import java.util.HashMap;

public class FirstNonRepeatingEle {
    static char pass(String st) {
        HashMap<Character, Integer> ms = new HashMap<>();
        for (char i : st.toCharArray()) {
            ms.put(i, ms.getOrDefault(i, 0) + 1);
        }
        for (char c : st.toCharArray()) {
            if (ms.get(c) == 1) {

                return c;
            }
        }
        return '-';
    }


    static void pass2(String s){
        // char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int cnt=1;
            for(int j=i+1;j<s.length();j++){
                char ch =s.charAt(j);
                if(ch==c)
                    cnt++;
                
            }
            if(cnt==1){
                System.out.println(c);
                break;
            }
        }
    }
    /*static void pass(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    } */
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        // approach 1st
    System.out.println(pass(str));
        // 2nd app
        // pass2(str);
    }
}
