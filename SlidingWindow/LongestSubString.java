package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

// Longest substring without contain repeating char
  
public class LongestSubString {
      // bruet force approach
      static int SubArray(String str){
        HashSet<Character> se =new HashSet<>();
        int maxlen=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(se.contains(str.charAt(j)))
               break;
               
               maxlen=Math.max(maxlen, j-i+1);
            
            se.add(str.charAt(j));
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String str="abababaind";
        System.out.println("len= "+subArr(str));
        System.out.println(SubArray(str));
    }
    // optimal approach
    static int subArr(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int lf =0, rt=0, maxlen=0;
        while (rt<str.length()) {
            if(map.containsKey(str.charAt(rt)))
                lf= Math.max(map.get(str.charAt(rt))+1,lf);
            map.put(str.charAt(rt), rt);
            maxlen=Math.max(maxlen, rt-lf+1);
            rt++;
        }
        return maxlen;
    }
}
