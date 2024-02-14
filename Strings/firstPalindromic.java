public class firstPalindromic {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String sol = firstPalindrome(words);
        System.out.println(sol);
    }


    public static String firstPalindrome(String[] words) {
        //take each string, convert to char array.

        for(String i : words){
            
            String res = (new StringBuilder(i).reverse().toString());

            if(res.equals(i)){
                return res;
            }

        }
        return "";
    }
}
