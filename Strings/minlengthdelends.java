public class minlengthdelends {
    public static void main(String[] args) {
        String s = "aabccabba";
        int res = min_len_after_del_ends(s);
        System.out.println(res);
    }


    public static int min_len_after_del_ends(String s){
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                break;
            }
            while(l<r && s.charAt(l)==s.charAt(l+1)){
              l++;
            }

            while(l<r && s.charAt(r)==s.charAt(r-1)){
                r--;
            }
            l++;
            r--;
        }
        return l>r?0:(r-l+1);
    }
}
