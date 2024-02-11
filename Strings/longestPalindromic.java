public class longestPalindromic {
    public static void main(String[] args) {
        String s = "abababa";
        String res = longest_Palindromic_substr(s);
        System.out.println(res+res.length());
    }

    public static String longest_Palindromic_substr(String s){
        String res = "";
        int len = 0;
        for(int i=0;i<s.length();i++){
            int l=i,r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>len){
                  len = r-l+1;
                  res = s.substring(l, r+1);
                }
                l--;
                r++;
            }

             l=i;
             r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>len){
                  len = r-l+1;
                  res = s.substring(l, r+1);
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
