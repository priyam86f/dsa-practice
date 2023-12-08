public class mergeStr {
    public static void main(String[] args) {
        String ans = merger("abc", "pqrstu");
        System.out.println(ans);
    }

    public static String merger(String word1,String word2){
        StringBuilder sb1 = new StringBuilder();

        for(int i=0;i<word1.length()||i<word2.length();i++){
            if(i<word1.length())
            sb1.append(word1.charAt(i));

            if(i<word2.length())
            sb1.append(word2.charAt(i));  
        }
        return sb1.toString();
    }
}
