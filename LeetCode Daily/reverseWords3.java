import javax.swing.JApplet;

public class reverseWords3 {
    public static void main(String[] args) {
        String s = "Let's take Leetcode contest";
        //op - s'teL ekat edocteeL tsetnoc
        String res = rev3(s);
        System.out.println(res);
    }



    public static String rev3(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String temp_Str="";
        String reverse_word="";

        for(int i=0;i<arr.length;i++){
            temp_Str=arr[i];
             char[] word = temp_Str.toCharArray();
             for(int j=word.length-1;j>=0;j--){
                if(j==word.length-1){
                reverse_word+=" ";
                }
                 reverse_word+=word[j];
             }
             
        } 
        sb.append(reverse_word);
return sb.toString().trim();
    }
}
