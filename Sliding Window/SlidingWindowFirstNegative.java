import java.util.ArrayList;

public class SlidingWindowFirstNegative {
    public static void main(String[] args) {
        int[] nums = {12,-1,-7,8,-15,30,16,28};
        int[] res = firstNegative(nums, 3);
        printArray(res);

    }



    public static int[] firstNegative(int[] nums,int k){
        int i=0;
        int j=0;
        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        int n = nums.length;

        while(j<n){
            if(nums[j]<0){
                tempList.add(nums[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(tempList.size()==0){
                  finalList.add(0);
                }
                else{
                    finalList.add(tempList.get(0));
                    if(nums[i]<0){
                        tempList.remove(0);
                    }
                }
                i++;
                j++;
            }
           
        }
//list to array
int answer[] = new int[finalList.size()];
for(int z=0;z<finalList.size();z++){
    answer[z]=finalList.get(z);
}
return answer;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"");
        }
    }
}
