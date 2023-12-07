public class largestOdd {
    public static void main(String[] args) {
        String ans = oddinstr("587");
        System.out.println(ans);
    }


    public static String oddinstr(String num){
        //return the largest odd substring

        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num))%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    
}
