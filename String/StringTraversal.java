package String;

public class StringTraversal {

    public static void main(String[] args) {
        String str = "Its Simple";
        // this is the first way to traverse
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }

        // Define a string
        String str1 = "Hello, World!";

        // Convert the string to a character array
        char[] charArray = str1.toCharArray();

        // Print the character array
        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // Access individual characters
        System.out.println("\nFirst Character: " + charArray[0]);
        System.out.println("Last Character: " + charArray[charArray.length - 1]);


        // traverse in word by word 
        String sen="Jay jay Bajrang Bali";
        sen +=" ";
        String w="";
        for(int i =0;i<sen.length();i++){
            char ch = sen.charAt(i);
            if(ch!=' '){
                w += ch;
            }
            else{
                System.out.println(w);
                w="";
            }
        }
    }
}
