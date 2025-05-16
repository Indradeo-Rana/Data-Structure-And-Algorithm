import java.util.HashMap;

public class Q5 {
    // Function to create the shift table
    public static HashMap<Character, Integer> createShiftTable(String pattern) {
        int m = pattern.length();
        HashMap<Character, Integer> shiftTable = new HashMap<>();

        // Initialize all characters with pattern length
        for (int i = 0; i < m - 1; i++) {
            shiftTable.put(pattern.charAt(i), m - 1 - i);
        }

        return shiftTable;
    }

    // Function to perform Horspool string matching
    public static int horspoolSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        HashMap<Character, Integer> shiftTable = createShiftTable(pattern);
        
        int i = m - 1; // Start from the end of the pattern

        while (i < n) {
            int j = 0;

            // Check for a match from right to left
            while (j < m && pattern.charAt(m - 1 - j) == text.charAt(i - j)) {
                j++;
            }

            if (j == m) {
                return i - m + 1; // Return index where match starts
            }

            // Get shift value from table, default is m
            char nextChar = text.charAt(i);
            i += shiftTable.getOrDefault(nextChar, m);
        }

        return -1; // No match found
    }

    public static void main(String[] args) {
        String text = "I LOVE MY COUNTRY INDIA";
        String pattern = "INDIA";

        int position = horspoolSearch(text, pattern);

        if (position != -1) {
            System.out.println("Pattern found at index: " + position);
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
