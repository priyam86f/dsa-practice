import java.util.HashSet;

public class isconsistent {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int res = countConsistentStrings(allowed, words);
        System.out.println(res);

    }


    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> charset = new HashSet();
        char[] wordsToChar = allowed.toCharArray();

        int count=0;

        for(char i :  wordsToChar){
            charset.add(i);
        }

        for(String word : words){
            if(isConsistent(word,charset) == true){
                count++;
            }
            
        }
        return count;
    }


    public static boolean isConsistent(String word,HashSet<Character> charset){
        for(char c : word.toCharArray()){
            if(!charset.contains(c)){
                return false;
            }
        }
        return true;
    }
}
