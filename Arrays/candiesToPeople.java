public class candiesToPeople{
    public static void main(String[] args) {
        int[] res = candies(10, 3);
        printArray(res);
    }


    public static int[] candies(int candies, int people){
        int[] result = new int[people];
        int count = 1;
        int sum = 0;
        for(int i=0;i<people;i++){
            // if(sum < candies && i == people-1 ){
            //     i=0;
            // }
            if(sum > candies){
                count=1;
            }
            result[i] = count++;
            sum+=count;
           
            
        }
        System.out.println(sum);
        return result;
    }


    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}