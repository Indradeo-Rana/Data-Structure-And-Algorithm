package String;

public class RemoveCharFromStr {
    static String removeChars(String string1, String string2) {
        int[] arr = new int[26]; // Array to track characters in string2
        int index;

        // Mark characters present in string2
        for (int i = 0; i < string2.length(); i++) {
            index = (int) string2.charAt(i) - 97; // ASCII value calculation
            arr[index]++;
        }

        StringBuilder copy = new StringBuilder();

        // Iterate over string1 and append characters not present in string2
        for (int i = 0; i < string1.length(); i++) {
            index = (int) string1.charAt(i) - 97;
            if (arr[index] == 0) { // Check if the character is not in string2
                copy.append(string1.charAt(i));
            }
        }

        return copy.toString();
    }
    public static void main(String[] args) {
        String str="computer";
        String str1="cat";
        System.out.println(removeChars(str,str1));
    }
    
}
