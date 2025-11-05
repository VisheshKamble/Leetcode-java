import java.util.*; 

// https://leetcode.com/problems/reverse-words-in-a-string/description/
class ReverseWords {
public static void main(String[] args) {
    String given = "the sky is blue";
    String result = reverseWords(given);
    System.out.println(result);
    
}   
 static String reverseWords(String s) {
   String[] words = s.trim().split("\\s+");

   Collections.reverse(Arrays.asList(words));

   return String.join(" ", words);
    } 
}
