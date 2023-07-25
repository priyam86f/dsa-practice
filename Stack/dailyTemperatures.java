import java.util.*;

class Pair{
    int key;
    int val;

    public Pair(int key,int val){
        this.key=key;
        this.val=val;
    }
}

public class dailyTemperatures {
    public static void main(String[] args) {
        int[] time_TILL_MAX_TEMP = {73,74,75,71,69,72,76,73};
        int[] res = DailyTemps(time_TILL_MAX_TEMP);
        printArray(res);
    }



    //Next Greater To Right

    public static int[] DailyTemps(int[] nums){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        int[] array = new int[nums.length];
        int[] temperatures = new int[n];

       for(int i=n-1;i>=0;i--){
          if(stack.size()==0){
            list.add(0);
          }else if(stack.size()!=0 && stack.peek().val>=nums[i]){
            list.add(stack.peek().key);
          }else if(stack.size()!=0 && stack.peek().val<=nums[i]){
            while(stack.size()!=0 && stack.peek().val<=nums[i]){
                stack.pop();
            }
            if(stack.size()==0){
                list.add(0);
            }
            else{
                list.add(stack.peek().key);
            }
          }
          stack.push(new Pair(i, nums[i]));
       }

       list2 = reverse_List(list);
       array=arr(list2);

       for(int i=0;i<n;i++){
        
         temperatures[i]=array[i]-i;

         if(array[i]-i<0){
            temperatures[i]=0;
        }
         
       }
       return temperatures;
    }

    public static ArrayList<Integer> reverse_List(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        return list2;
    }

    //function to convert ArrayList to Array

    public static int[] arr(List<Integer> list){
        int[] ARRAY = new int[list.size()];
        for(int i=0;i<list.size();i++){
          ARRAY[i]=list.get(i);
        }
        return ARRAY;
    }

    public static void printArray(int[] nums){
      for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]+"");
      }
    }

}
