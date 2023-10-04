import java.util.ArrayList;
import java.util.Arrays;


public class designHashMap {
    public static void main(String[] args) {
        //created an instance of the designHashMap class,
        designHashMap myHashMap = new designHashMap();
        myHashMap.put(1, 100);
        System.out.println(myHashMap.get(1));;
    }


    int[] data = new int[1000001];
    
    public  void myMap(){
       Arrays.fill(data, -1); 
    }

    public void put(int key, int value) {
       data[key] = value;
    }
    
    public int get(int key) {
      return data[key];
        
    }
    
    public void remove(int key) {
        data[key] = -1;
    }
}
