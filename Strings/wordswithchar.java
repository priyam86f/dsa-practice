import java.util.*;
public class wordswithchar {
    public static void main(String[] args) {
        String words[] = {"leet","code"};
        List<Integer> res = words_with_ch(words, 'e');
        printList(res);
    }



    public static List<Integer> words_with_ch(String[] words, char x){
        ArrayList<Integer> mylist = new ArrayList();

        for(int i=0;i<words.length;i++){
          for(int j=0;j<words[i].length();j++){
              if(x==words[i].charAt(j)){
                  mylist.add(i);
                  break;
              }
          }
        }
        return mylist;
    }


    public static void printList(List<?> list) {
        if (list == null) {
            System.out.println("The list is null.");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
