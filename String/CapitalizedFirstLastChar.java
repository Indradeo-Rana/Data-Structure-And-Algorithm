package String;

public class CapitalizedFirstLastChar {
    public static void main(String[] args) {
        String str="a things of beauty is joy forever";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word:words){
            if(word.length()>1){
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1, word.length()-1));
                result.append(Character.toUpperCase(word.charAt(word.length()-1)));
                result.append(" ");
            }else{
                result.append(word.toUpperCase()).append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
