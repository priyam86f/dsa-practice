import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = sliding_window_maximum(nums, 3);
        printArray(res);

    }


    public static int[] sliding_window_maximum(int[] nums,int k){
        Deque<Integer> tempDeque = new ArrayDeque<>();
        int i=0;
        int j=0;
        int n = nums.length;
        int[] result = new int[nums.length-k+1];

        while(j<n){
            while(!tempDeque.isEmpty() && nums[j]>tempDeque.peekLast()){
                tempDeque.removeLast();
            }
            tempDeque.add(nums[j]);

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){

                result[i]=tempDeque.peekFirst();
                if(nums[i]==tempDeque.peekFirst()){
                    tempDeque.removeFirst();
                }
                i++;
            j++;
            }
            
        }
        return result;
        }
        public static void printArray(int[] nums){
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]+"");
            }
        }
    }

