// https://leetcode.com/problems/length-of-last-word/description/

class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "The Sky is blue";
        System.out.println(lengthOfLastWord(s));
        
    }
    static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}