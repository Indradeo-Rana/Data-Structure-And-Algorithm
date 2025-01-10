package String;

public class CharCase {
    // q1. print ASCII code of each character of a string
    static void code(String str) {
        char[] charArr = str.toCharArray();
        System.out.println();
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i] + " " + (int) charArr[i]);
        }
    }

    // print only uppercase character of a string
    // note boolean type method like isUpperCase will be process one by one not in a
    // charArray
    static void UpperCaseOnly(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(ch);
            }
        }
    }

    // count the only uppercase character only and same process for lowercase as
    // well
    static void countUpperCase(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                cnt++;
        }
        System.out.println("total upperCase character : " + cnt);
    }

    // create a new string conating only uppercase character
    static void creatingNewString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }

    // Create a new string with digit first and then character
    // Create a new string with uppercase first and then lower case like
    static void DigitThenCharacter(String str) {
        String d = "";
        String c = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                d += ch;
            } else {
                c += ch;
            }
        }
        System.out.println(d + c);
    }

    // Create a new String after removing all spaces
    static void removeSpace(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                newString += ch;
            }
        }
        System.out.println(newString);
    }

    // Create a new String after remove the case ie upper to lower
    static void removeCase(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                s = s + Character.toLowerCase(ch);
            } else {
                s += Character.toUpperCase(ch);
            }
        }
        System.out.println("after remove cases :" + s);
    }

    // reverse the character of each string
    static void reverse(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println("Before reversing the String \n" + str);
        System.out.println("After reversing\n" + newStr);
    }

    // check weather a given string is palindrome or not
    static void palindrome(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            s = ch + s;
        }
        System.out.println();
        if (str.equals(s)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    // String Encoding programs - Piglatin if start with vowel(EAT -> EAT+WAY) |else
    // CLEAR->EARCLAY
    static void Piglatin(String str) {
        String pl = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char u = Character.toUpperCase(ch);
            if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U') {
                if (i == 0) 
                    pl = str+"WAY";
                else
                    pl = str.substring(i)+str.substring(0,i)+"AY";
                break;
            }
        }
        System.out.println("The piglatin string : "+pl);
    }

    // create a word encoding progrsm which moves each letter by 2 ie  a-> c; and y-> a
    static void encoding(String str){
        String s="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='y' || ch =='y' ||ch =='y' ||ch =='y' )
                ch -=26;
            ch+=2;
            s +=ch;
        }
        System.out.println("Result is: "+ s);
    }

    public static void main(String[] args) {
        // q1. print ASCII code of each character of a string
        // code("RAM");
        // UpperCaseOnly("Jay Shree Ram"); // same programm can be used for lowerCase,
        // digit, alphabets
        // countUpperCase("Govind Bole Hari Gopal Bolo");
        // creatingNewString("Din Dayal Virudh Sambhari Harhun Nath Mam Snakat Bhari");
        // DigitThenCharacter("1DS23MC030");
        // removeSpace("Radhe radhe !");
        // removeCase("IndraDeo");
        // reverse("This is demo of reverse the string here");
        // palindrome("LEVEL");
        // Piglatin("clear");
        encoding("Rab");
    }
}
