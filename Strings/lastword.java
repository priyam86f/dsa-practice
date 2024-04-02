public class lastword {
    public static void main(String[] args) {
        String s1 = "hello     world from c programming       ";
        int res = lengthOfLastWord(s1);
        System.out.println(res);
    }



    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }else if(s.charAt(i)==' '){
                break;
            }
    }
    return length;

    }
}
