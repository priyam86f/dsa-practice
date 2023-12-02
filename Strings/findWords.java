import java.util.*;
public class findWords {
    public static void main(String[] args) {
        String[]  words = {"cat","bt","hat","tree"};
        String word = "atach";
        int res = countCharacters(words, word);
        System.out.println(res);
    }

    public static int countCharacters(String[] words, String chars) {
      
        HashMap<Character,Integer> charsMap = new HashMap<>();
       
        char charsArray[] = chars.toCharArray();
  
        for(char i : charsArray) {
            charsMap.put(i,charsMap.getOrDefault(i,0)+1);
        } 
        //now we have stored all the occurences of chars in the map.
        //a--->2,t--->1,c--->1,h--->1
    int result=0;
        for(String word : words){
            if(canFormWord( word,new HashMap<>(charsMap))){
                result+=word.length();
            }
        }
  return result;
        
      }

      public static boolean canFormWord(String word,HashMap<Character,Integer> charsMap){
        for(char c : word.toCharArray()){
            if(charsMap.containsKey(c) && charsMap.get(c) > 0){
                charsMap.put(c,charsMap.get(c)-1);
            }else{
                return false;
            }
            
        }
        return true;
    }
}
