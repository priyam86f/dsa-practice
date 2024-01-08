public class minOps{
    public static void main(String[] args){
       String t = "0110111000111";
       int res = minforbinary(t);
       System.out.println(res);
       
    }


    public static int minforbinary(String s){
         int count = 0; // operations if s starts with '0'
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) { // odd
                count += s.charAt(i) == '0' ? 1 : 0;
            } else { // even
                count += s.charAt(i) == '1' ? 1 : 0;
            }
        }
        return Math.min(count, s.length() - count);
    }
}