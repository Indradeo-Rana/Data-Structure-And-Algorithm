
public class Horspool {
    // Horspool's algorithm for substring search
    static int[] shiftTable(String pattern) {
        int m = pattern.length();
        int[] table = new int[256];
        for (int i = 0; i < 256; i++) table[i] = m;
        for (int i = 0; i < m - 1; i++) table[pattern.charAt(i)] = m - 1 - i;
        return table;
    }
    // Search for pattern in text using Horspool's algorithm
    // Returns the index of the first occurrence of pattern in text, or -1 if not found
    static int search(String text, String pattern) {
        int[] table = shiftTable(pattern);
        int n = text.length(), m = pattern.length(), i = 0;
        while (i <= n - m) {
            int j = m - 1;
            while (j >= 0 && pattern.charAt(j) == text.charAt(i + j)) j--;
            if (j < 0) return i;
            i += table[text.charAt(i + m - 1)];
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "I LOVE MY COUNTRY INDIA";
        String pattern = "INDIA";
        int pos = search(text, pattern);
        System.out.println(pos != -1 ? "Found at " + pos : "Not found");
    }
}

