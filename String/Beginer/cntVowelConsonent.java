package String.Beginer;

public class cntVowelConsonent {


    static void CountVowelConsDigitSpecial(String str){
        int v=0,con=0,digit=0,special=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);

            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                ch =Character.toLowerCase(ch);
                if("aeiou".indexOf(ch) != -1) v++;
                else con++;
            }
            else if(ch>='0' && ch<='9') digit++;
            else special++;
        }
        System.out.println("Total number of vowels :"+v);
        System.out.println("Total number of cons :"+con);
        System.out.println("Total number of digit :"+digit);
        System.out.println("Total number of special :"+special);

    }
    public static void main(String[] args) {
        String str = "Indradeo";
        CountVowelConsDigitSpecial(" A 1 B @ d  adc");
        int cntV = 0, cntCon = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                cntV++;
            } else {
                cntCon++;
            }
        }
        System.out.println("Total number of vowels :" + cntV);
        System.out.println("Total number of consonent :" + cntCon);
        // 2nd approach
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}
