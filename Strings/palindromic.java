public class palindromic {
    public static void main(String[] args) {
        String s = "aaa";
        int res = longest_Palindromic_substr(s);
        System.out.println(res);
    }

    public static int longest_Palindromic_substr(String s){
       int count=0;
        int len = 0;
        for(int i=0;i<s.length();i++){
            int l=i,r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            }

             l=i;
             r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            }
        }
        return count;
    }
}
