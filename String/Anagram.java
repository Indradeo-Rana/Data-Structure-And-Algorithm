package String;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    static void pass1(String str, String str1) {
        char[] charArr = str.toCharArray();
        char[] charArr1 = str1.toCharArray();
        boolean result = true;
        // check length and then sort the char array
        if (charArr.length != charArr1.length) {
            result = false;
        } else {
            Arrays.sort(charArr);
            Arrays.sort(charArr1);
        }

        // for (int i = 0; i < charArr1.length; i++) {
        //     if (charArr[i] != charArr1[i])
        //         result = false;
        // }

        result=Arrays.equals(charArr, charArr1);

        if (result)
            System.out.println("Strings are anagram");
        else
            System.out.println("not an anagram");
    }
// pass 2 
    static void  pass2(String str, String str2){
        HashMap<Character,Integer> map= new HashMap<>();
        boolean ans=true;
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char ch:str2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }
        for(var id:map.entrySet()){
            if(id.getValue()!=0)
               ans=false;
        }
        if(ans){
            System.out.println("anagram");
        }
        else{
            System.out.println("not an anagram");
        }
    }
    public static void main(String[] args) {
        //pass1("geekers", "kseeg");  // navier  tc  O(n*log(n))
        pass2("India", "Indsa");   // HashMap  tc  O(m+n)
    }

}
