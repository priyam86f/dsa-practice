public class reverseWords1 {
    public static void main(String[] args) {
        String s = "       the         sky     is       green  ";
        //OP : "green is sky the"
        String res = reverse_words_in_Str(s);
        System.out.println(res);
    }


    public static String reverse_words_in_Str(String s){
        String[] arr = s.trim().split("\\s+");

        String out="";

        for(int i=arr.length-1;i>0;i--){
            out += arr[i]+" ";
        }

        return out+arr[0];
    }
}
