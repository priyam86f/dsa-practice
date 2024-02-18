import java.util.PriorityQueue;

public class maxjump {
    public static void main(String[] args) {
        int[] heights = {4,2,7,6,9,14,12};
        int bricks = 5;
        int ladder = 1;
        int res = furthest_bldg(heights, bricks, ladder);
        System.out.println(res);
    }



    public static int furthest_bldg(int[] heights,int bricks,int ladder){
       PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a) ;

       for(int i=0;i<heights.length-1;i++){
        int diff = heights[i+1]-heights[i];

        if(diff<=0){
            continue;
        }

        bricks-=diff;
        heap.add(diff);

        if(bricks<0){
            //pop the max jump
            int maxjump = heap.poll();
            bricks+=maxjump;

            if(ladder>0){
                ladder--;
            }else{
                return i;
            }
        }
        
       }
       return heights.length-1;
        
    }
}