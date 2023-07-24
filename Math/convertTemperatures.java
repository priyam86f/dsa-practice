//LC 2469.
public class convertTemperatures {
    public static void main(String[] args) {
        double[] res = temps(36.50);
        printArray(res);
    }

    public static double[] temps(double celsius){
        double temp[] = new double[2];
        double kelvin = celsius + 273.15;
        double farenheit = (celsius*1.80) + 32.00;
        temp[0]=kelvin;
        temp[1]=farenheit;
        return temp;
    }

    public static void printArray(double[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
