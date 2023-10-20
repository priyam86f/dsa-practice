import java.util.Stack;

public class backspace {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean res = bsstrcmp(s, t);
        System.out.println(res);
    }


    public static boolean bsstrcmp(String s,String t){
        char[] strings = s.toCharArray();
        char[] stringt = t.toCharArray();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        //both are now chararray

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        //iterate s

        for(char l : strings){
            if(l!='#'){
               stack1.push(l);
            }
            else if(!stack1.isEmpty()){
                stack1.pop();
            }
        }
        

        for(char m : stringt){
            if(m!='#'){
                stack2.push(m);
            }
           else if(!stack2.isEmpty()){
              stack2.pop();
           }
        }
        

       
     
     return stack1.equals(stack2);
    }
}
