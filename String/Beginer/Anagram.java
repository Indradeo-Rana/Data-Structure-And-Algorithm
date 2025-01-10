package String.Beginer;

import java.util.Arrays;
// import java.util.HashMap;

public class Anagram {
    static boolean isAnagram(String str, String str2){
        // HashMap<Character, Integer> map = new HashMap<>();
       


        return false;
    }
    public static void main(String[] args) {
        String str="Indra";
        String str1="rndia";
        //approach 1
        if(str.length()!=str1.length()){
            System.out.println("Not an anagram");
        }
        char[] arr=str.toLowerCase().toCharArray();
        char[] arr1=str1.toLowerCase().toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
       System.out.println( Arrays.equals(arr , arr1));

       // approach no 2;
       System.out.println(isAnagram(str,str1));
    }
    
}
