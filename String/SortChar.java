package String;

import java.util.Arrays;

public class SortChar {

    static void pass(String str){
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        System.out.println("using sorting algo");
        System.out.println(ch);
    }

    static void pass1(String str){
        int[] arr =new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print((char) ('a' + i));
            }
        }
    }
    public static void main(String[] args) {
        String str="indradeo";

        pass(str);
        pass1(str);
    }
}
