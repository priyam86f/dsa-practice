public class getmaxscore {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        System.out.println(maximumGain(s, x, y)); 
    }

    public static int get_max_score(String s, String highvalsubstr,int highVal,String lowvalsubstr,int lowVal){
StringBuilder sb = new StringBuilder();
int count=0;
        for(char c : s.toCharArray()){
          if(sb.length()>0 && sb.charAt(sb.length()-1)==highvalsubstr.charAt(0)
          && c == highvalsubstr.charAt(1)){
            sb.deleteCharAt(sb.length()-1);
            count+=highVal;
          }else{
            sb.append(c);
          }
          
        }

        String highvalstr = sb.toString();
        System.out.println(highvalstr);
        sb = new StringBuilder();

        for(char c : highvalstr.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==lowvalsubstr.charAt(0)
            && c == lowvalsubstr.charAt(1)){
                sb.deleteCharAt(sb.length()-1);
                count+=lowVal;
            }else{
                sb.append(c);
            }
        }
return count;



    }

    public static int maximumGain(String s,int x,int y){
       if(x>y){
        return get_max_score(s, "ab", x, "ba", y);
       }else{
        return get_max_score(s, "ba", y, "ab", x);
       }
    }
}
