public class checkstring {
 public static void main(String[] args) {
    String s  = "aaaabaaa";
    boolean res = checkString(s);
    System.out.println(res);
 }  
 
 
 public static boolean checkString(String s) {
    /*at any point if b appears before a then return false
     */

    boolean res = true;
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
            res = false;
        }
    }
    return res;
}
}
