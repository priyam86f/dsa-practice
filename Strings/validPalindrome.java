public class validPalindrome {
    // LeetCode 125. Valid Palindrome
    /*
     * A phrase is a palindrome if, after converting all uppercase
     * letters into lowercase letters and removing all non-alphanumeric characters,
     * it reads the same forward and backward. Alphanumeric characters include
     * letters and numbers.
     * 
     * Given a string s, return true if it is a palindrome, or false otherwise.
     */

    /*
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     */

    /*
     * Constraints:
     * 
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     */
public static void main(String[] args) {
    String s = "race a car";
    String sol = cleanString(s);
    boolean res = isValidPalindrome(sol);
    System.out.println(res);
}
     public static boolean isValidPalindrome(String s){
        int n = s.length();
        for(int i=0;i<(n/2);i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;

     }

     public static String cleanString(String s){
        String res = s.replaceAll("\\p{Punct}|\\s", "");
        return res.toLowerCase();
     }
}
