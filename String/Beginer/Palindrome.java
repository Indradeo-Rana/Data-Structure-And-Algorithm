package String.Beginer;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        if (rev.equals(str))
            return true;

        return false;
    }
}
