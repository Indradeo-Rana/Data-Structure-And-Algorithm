package String;

public class WordCase {
    // print word by word
    static void printWord(String str) {
        str += " ";
        String w = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                w += ch;
            } else {
                System.out.println(w);
                w = "";
            }
        }
    }

    //print first character of each word
    static void onlyFirstChar(String str){
        str +=" ";
        String w="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                w +=ch;
            }else{
                System.out.println(w.charAt(0)); // print only first char 
                System.out.println(w.substring(0,2)); // print  first 2 char 
                w="";
            }
        }
    }

    // print only start with 'r'/ 'R' // endsWith("ing") //contains('e')
    static void startWithR(String str){
        str +=" ";
        String w="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                w +=ch;
            }else{
                if(w.contains("r")){
                    System.out.println(w);
                }
                w="";
            }
        }
        System.out.println("Nmaste");
    }

    // print  word having only three char
    static void onlyHaveThreeChar(String str){
        str +=" ";
        String w="";
        for(int  i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                w+=ch;
            }
            else{
                if(w.length()==3){
                    System.out.println(w);
                }
                w="";
            }
        }
    }
    
    public static void main(String[] args) {

        // q1. print each word in a separate line
        // System.out.println("print word by word");
        // printWord("HAR HAR MAHEDEV");
        //onlyFirstChar("HAR HAR MAHEDEV");
        // startWithR("Indradeo rana"); // endsWith("ing") //contains('e')
        // onlyHaveThreeChar("A red rose in bed");
        countWords("Geeks for   gee abd\\p\"");
    }
    static void countWords(String str){
        // str = str.replaceAll("\\s+", " ").trim();
        // System.out.println(str.length());
        String[] word=str.split("\\s+");
        System.out.println(word.length);
    }
}