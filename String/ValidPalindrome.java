// https://leetcode.com/problems/valid-palindrome/description/

class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        
    }
    static boolean isPalindrome (String s){
        if(s == null || s.length() == 0){
            return false ;
        }
        //Method 1
        /*int start = 0 ;
        int end = s.length() - 1 ;

        while (start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(end)){
                return false ;
            }
            start++ ;
            end--;
        }
        return true;*/

        //Method 2 

        s = s.toLowerCase().replaceAll("[^a-z]" , "");
        for (int i = 0 ; i <= s.length() / 2 ; i++){
           if(s.charAt(i) != s.charAt(s.length() - 1 -i)){
            return false;
           } 
        }
     return true;
     
    }
}