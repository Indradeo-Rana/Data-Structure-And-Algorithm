package String;
public class RemoveOuterParentheses {
    static String reverseOuterParentheses(String s){
        StringBuilder ans = new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')')
                cnt--;
            if(cnt!=0)
                ans.append(s.charAt(i));
            if(s.charAt(i)=='(')
                cnt++;
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="(()())(())";
        String s1=reverseOuterParentheses(s);
        System.out.println(s1);
    }
    
}
