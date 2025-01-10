package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AAA {
 public static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
  public static void main(String[] args) {
    // String str="(a-(b+c)+d)";
    // String st="";
    // for(int i=0;i<str.length();i++){
    //   char ch =str.charAt(i);
    //   if(ch=='(' || ch==')')
    //   continue;
    //   else{
    //     st+=ch;
    //   }
    // }


//  System.out.println(st);

// Input: str = “i.like.this.program.very.much” 
// Output: str = “much.very.program.this.like.i”
// String s="..i.like.this.program.very.much";
// String [] words=s.split("\\.+");
// // System.out.println(words.length);
// for(int i=0;i<words.length;i++){
// // System.out.print(words[words.length-1-i]+".");
// }
// String[] sts=str.split("\\.+");
// ArrayList<String> part= new ArrayList<>();
// for(String wrd:sts){
//   if(!part.isEmpty())
//   part.add(wrd);
// }
// Collections.reverse(part);
// System.out.print(String.join(".", part));


    // lexigraphical
    // String str1="india";
    // String str2="indja";
    // System.out.println(str2.compareTo(str1));
    
   String[] arr = {"no", "on", "is"};
  //  String[] arr = {"listen", "silent", "enlist", "hello", "ohell" ,"tac"};
        List<List<String>> result = groupAnagrams(arr);
        System.out.println(result);
  }
}