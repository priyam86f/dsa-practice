import java.util.*;
public class LC316_remove_duplicate_letters {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        String res = lex_smaller(s);
        System.out.println(res);

    }

    public static String lex_smaller(String s){
        //data variables
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[26];
        int[] frequency = new int[26];

        //setting up the frequency of all the elements

        for(char c : s.toCharArray()){
            frequency[c-'a']++;
        }

        for(char c : s.toCharArray()){
            frequency[c-'a']--;

            if(visited[c-'a']){
                continue;
            }
            //pop condition

            while(!stack.isEmpty() && stack.peek()>c && frequency[stack.peek()-'a']!=0){
                char out = stack.pop();
                visited[out-'a']=false; //index of that element is now set to false.
            }
            stack.push(c);
            visited[c-'a']=true;//as the element is added, the index is set to true.
        }
        //finally string builder
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }

        return sb.toString();

    }
}
