public class maxoddbinary {
    public static void main(String[] args) {
        String t = "101000";
        String sol = max_odd_bin(t);
        System.out.println(sol);
    }

    public static String max_odd_bin(String s){
        int count = 0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            count++;
        }
       }
       return "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1"; // 1111 0000 1
    }
}
