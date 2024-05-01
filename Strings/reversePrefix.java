public class reversePrefix {
    public static void main(String[] args) {
        String s = "abcpef";
        char ch = 'd';
        String res = reverse_prefix_String(s, ch);
        System.out.println(res);
    }

    public static String reverse_prefix_String(String s,char ch){
        int endIndex=0;
        boolean flag=false;


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
              endIndex = i;
              break;
            }
        }

        if(endIndex==-1){
            return s;
        }

        //now reverse the portion only till endIndex

        char[] charArray = s.toCharArray();
        int startIndex = 0;

        while (startIndex < endIndex) {
            // Swap characters
            char temp = charArray[startIndex];
            charArray[startIndex] = charArray[endIndex];
            charArray[endIndex] = temp;

            // Move indices
            startIndex++;
            endIndex--;
        }
        return new String(charArray);
    }
}
