package String;

public class ReverseCase {
    public static void main(String[] args) {
        String str = "";
        String ans = "";
        
        if (args.length > 0) {
            str = args[0];
        } else {
            str = "HeLo Hi";  // Default value
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                ans += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                ans += Character.toLowerCase(ch);
            } else {
                ans += ch;
            }
        }
        
        System.out.println(ans);
    }
    
}
