package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagram {
    public ArrayList<ArrayList<String>> checkAnagram(String[] arr){
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
            ArrayList<String> anagramGroup = new ArrayList<>();
            anagramGroup.add(arr[i]);
            visited[i] = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (!visited[j] && isAnagram(arr[i], arr[j])) {
                anagramGroup.add(arr[j]);
                visited[j] = true;
                }
            }
            result.add(anagramGroup);
            }
        }
        return result;
        }

        private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
            return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
        // String arr[] ={"act", "dog", "cat","god","tac"};
        String arr[] ={"no","on","is"};
        // PrintAnagram obj= new PrintAnagram();
        // ArrayList<ArrayList<String>> anagram= obj.checkAnagram(arr);
        // for (ArrayList<String> group : anagram) {
            // System.out.println(group);
        // }

        // simple approach here
        List<List<String>> result= groupAna(arr);  // calling method 
        System.out.println("our answer will be ..");
        System.out.println(result); // print the result
    }
    public static List<List<String>> groupAna(String [] arr){ // method defination
        HashMap<String, List<String>> map = new HashMap<>(); // creating hashmap with key -> string and value-> list of string
        for(String str : arr){ 
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }


        return new ArrayList<>(map.values());
    }
}
