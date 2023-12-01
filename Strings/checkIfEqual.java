public class checkIfEqual {
    public static void main(String[] args) {
        String[] array1 = {"ab","c"};
        String[] array2 = {"a","cb"};

        boolean result = checkIfEQL(array1, array2);
        System.out.println(result);

    }

    public static boolean checkIfEQL(String[] s1, String[] s2){
      StringBuilder str1 = new StringBuilder();
      StringBuilder str2 = new StringBuilder();

    
      for(int i=0;i<s1.length;i++){
        str1.append(s1[i]);
      }

      for(int i=0;i<s2.length;i++){
        str2.append(s2[i]);
      }

      String string1 = str1.toString();
      String string2 = str2.toString();


      if(string1.equals(string2)){
        return true;
      }
      return false;

    }
}
