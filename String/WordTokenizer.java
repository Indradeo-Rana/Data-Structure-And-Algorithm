package String;

import java.util.StringTokenizer;

public class WordTokenizer {
    public static void main(String[] args) {
        // using string tokenizer class
        StringTokenizer st= new StringTokenizer("Har Har Mahedev"," ");
        while (st.hasMoreTokens()) {
           // String w =st.nextToken();   // Extracts a word everytime
            //System.out.println(w);
        }

    }
}
