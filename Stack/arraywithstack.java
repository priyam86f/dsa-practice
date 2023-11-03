import java.util.List;

public class arraywithstack {
    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
    }




    public static List<String> stackops(int[] target,int n){
        List<String> list = new ArrayList();
        int current = 1;
        int index = 0;

        while(current<=n && index<target.length){
            int num = target[index];

            if(num == current){
                list.add("Push");
                current++;
                index++;
            }else{
                list.add("Push");
                list.add("Pop");
                current++;
            }
        }
        return list;
    }
}
