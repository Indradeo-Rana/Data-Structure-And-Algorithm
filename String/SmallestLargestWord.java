package String;

public class SmallestLargestWord {
    public static void main(String[] args) {
        String str="This is a sample demo";

        String[] words= str.split(" ");
        String smallest=words[0];
        String longest=words[0];

        for(String word : words){
            if(smallest.length()>word.length())
                smallest = word;
            if(longest.length()<word.length())
                longest=word;
        }
        System.out.println("Smallest word of a string : "+smallest);
        System.out.println("Longest word of a string : "+longest);
    }
}
