package String;

public class SumOfString {
    public static void main(String[] args) {
        String str = "1abc23";
        str +=" ";
        int n = 0;
        String temp = "0";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')

                temp += ch;
            else {
                if(!temp.isEmpty())
                n = n + Integer.parseInt(temp);
                temp = "";
            }
        }

        System.out.println(n);
    }

}
