// package String;

// public class AAA {
//     // 1. Reverse a String
//     public static String reverse(String str) {
//         StringBuilder reversed = new StringBuilder();
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed.append(str.charAt(i));
//         }
//         return reversed.toString();
//     }

//     public static void main(String[] args) {
//         String input = "Hello";
//         System.out.println(reverse(input)); // Output: "olleH"
//     }
// }

// // 2. Check Palindrome
// public class PalindromeCheck {
//     public static boolean isPalindrome(String str) {
//         int left = 0, right = str.length() - 1;
//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String input = "madam";
//         System.out.println(isPalindrome(input)); // Output: true
//     }
// }

// // 3. Count Vowels and Consonants
// public class VowelConsonantCounter {
//     public static void countVowelsAndConsonants(String str) {
//         int vowels = 0, consonants = 0;
//         str = str.toLowerCase();

//         for (char c : str.toCharArray()) {
//             if (c >= 'a' && c <= 'z') {
//                 if ("aeiou".indexOf(c) != -1) {
//                     vowels++;
//                 } else {
//                     consonants++;
//                 }
//             }
//         }

//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + consonants);
//     }

//     public static void main(String[] args) {
//         String input = "Hello World!";
//         countVowelsAndConsonants(input);
//         // Output: Vowels: 3, Consonants: 7
//     }
// }

// // 4. Remove White Spaces
// public class RemoveSpaces {
//     public static String removeSpaces(String str) {
//         return str.replaceAll("\\s", "");
//     }

//     public static void main(String[] args) {
//         String input = "Java Programming";
//         System.out.println(removeSpaces(input)); // Output: "JavaProgramming"
//     }
// }

// // 5. Convert Case
// public class CaseConverter {
//     public static void main(String[] args) {
//         String input = "Java Programming";

//         String upper = input.toUpperCase();
//         String lower = input.toLowerCase();

//         System.out.println("Uppercase: " + upper); // Output: "JAVA PROGRAMMING"
//         System.out.println("Lowercase: " + lower); // Output: "java programming"
//     }
// }

// // 6. Check Anagram
// import java.util.Arrays;

// public class AnagramCheck {
//     public static boolean isAnagram(String str1, String str2) {
//         char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
//         char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         return Arrays.equals(arr1, arr2);
//     }

//     public static void main(String[] args) {
//         String str1 = "Listen";
//         String str2 = "Silent";
//         System.out.println(isAnagram(str1, str2)); // Output: true
//     }
// }

// // 7. Character Frequency
// import java.util.HashMap;

// public class CharacterFrequency {
//     public static void countFrequency(String str) {
//         HashMap<Character, Integer> freqMap = new HashMap<>();

//         for (char c : str.toCharArray()) {
//             freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//         }

//         for (char c : freqMap.keySet()) {
//             System.out.println(c + ": " + freqMap.get(c));
//         }
//     }

//     public static void main(String[] args) {
//         String input = "hello world";
//         countFrequency(input);
//     }
// }

// // 8. Substring Check
// public class SubstringCheck {
//     public static boolean isSubstring(String str, String substr) {
//         return str.contains(substr);
//     }

//     public static void main(String[] args) {
//         String str = "Hello World";
//         String substr = "World";
//         System.out.println(isSubstring(str, substr)); // Output: true
//     }
// }

// // 9. Remove Duplicates
// import java.util.LinkedHashSet;

// public class RemoveDuplicates {
//     public static String removeDuplicates(String str) {
//         LinkedHashSet<Character> set = new LinkedHashSet<>();
//         for (char c : str.toCharArray()) {
//             set.add(c);
//         }

//         StringBuilder result = new StringBuilder();
//         for (char c : set) {
//             result.append(c);
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String input = "programming";
//         System.out.println(removeDuplicates(input)); // Output: "progamin"
//     }
// }

// // 10. Find First Non-Repeating Character
// import java.util.HashMap;

// public class FirstNonRepeatingCharacter {
//     public static char firstNonRepeating(String str) {
//         HashMap<Character, Integer> freqMap = new HashMap<>();

//         for (char c : str.toCharArray()) {
//             freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//         }

//         for (char c : str.toCharArray()) {
//             if (freqMap.get(c) == 1) {
//                 return c;
//             }
//         }
//         return '_'; // Return '_' if no non-repeating character is found
//     }

//     public static void main(String[] args) {
//         String input = "swiss";
//         System.out.println(firstNonRepeating(input)); // Output: "w"
//     }
// }

// // Additional problems can be added similarly. Let me know if you need more or explanations for specific parts!

//     public static void main(String[] args) {
       
//     }
// }
