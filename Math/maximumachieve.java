public class maximumachieve {
    public static void main(String[] args) {
        int x = maxAchievableNo(6, 2);
        System.out.println(x);
    }


    public static int maxAchievableNo(int num,int t){
        return num+t+t;
    }
}
