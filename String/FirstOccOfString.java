package String;

public class FirstOccOfString {
    static int pass(String haystack, String needle){
        for(int i =0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i, needle.length()+i).equals(needle))
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack="sadbutsad", needle="sad";
        System.out.println("index : "+pass(haystack,needle));
        
    }
}
