import java.util.* ; 

// https://leetcode.com/problems/reverse-words-in-a-string/description/
class ReverseWords {
public static void main(String[] args) {
    String given = "the sky is blue";
    String result = reverseWords(given);
    System.out.println(result);
    
}   
 static String reverseWords(String s) {
        // Trim and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Reverse list
        Collections.reverse(Arrays.asList(words));
        
        // Join with a single space
        return String.join(" ", words);
    } 
}
