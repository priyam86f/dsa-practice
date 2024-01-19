public class shuffleString{
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String res = restoreString(s, indices);
        System.out.println(res);
    }


    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
         char[] result = new char[indices.length]; 
         for (int i = 0; i < indices.length; i++) {
             result[indices[i]] = s.charAt(i);
         }
         return new String(result);
     }
}