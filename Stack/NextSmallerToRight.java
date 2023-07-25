import java.util.*;
import java.io.*;

/* Given an Array nums = {4,3,2,1}
Find the nearest smaller element to the right. If no 
element is greater, push -1.
O/P - {3,2,1,-1}
*/
public class NextSmallerToRight {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        int[] res = NSR(nums);
        printArray(res);
    }


    /*Algorithm : STEP 1 - If the Stack is empty, push -1 in the ArrayList 
     *            STEP 2 - If Stack not empty and peek is smaller than arr[i], push 
     *                     peek in the list.
     *            STEP 3 - If the Stack contains only small elements, pop till we find 
     *                     a greater element.
     *            STEP 4 - Finally at the end, push the visited element, arr[i] in the Stack.
    */
    public static int[] NSR(int[] nums){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] array = new int[nums.length];

        for(int i=n-1;i>=0;i--){
          if(stack.size()==0){
            list.add(-1);
          }
          else if(stack.size()!=0 && stack.peek()<=nums[i]){
            list.add(stack.peek());
          }
          else if(stack.size()!=0 && stack.peek()>=nums[i]){
            while(stack.size()!=0 && stack.peek()>=nums[i]){
                stack.pop();
            }
            if(stack.size()==0){
                list.add(-1);
            }else{
                list.add(stack.peek());
            }
          }
          stack.push(nums[i]);
        }

        list2 = reverse_List(list);
        array=arr(list2);

        return array;
    }

    //function to reverse an ArrayList()

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
