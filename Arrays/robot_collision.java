import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class robot_collision {

    public static void main(String[] args) {
        int[] positions = {3, 5, 2, 6};
        int[] health = {10, 10, 15, 12};
        String directions = "RLRL";
        List<Integer> res = robot_collisions(positions, health, directions);
        System.out.println(res);
    }

    public static List<Integer> robot_collisions(int[] positions, int[] healths, String directions) {
         Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < positions.length; i++) {
            indexMap.put(positions[i], i);
        }

        List<Integer> sortedPositions = new ArrayList<>();
        for (int position : positions) {
            sortedPositions.add(position);
        }
        Collections.sort(sortedPositions);

        Stack<Integer> stack = new Stack<>();

        for (int p : sortedPositions) {
            int i = indexMap.get(p);
            if (directions.charAt(i) == 'R') {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && directions.charAt(stack.peek()) == 'R' && healths[i] > 0) {
                    int i2 = stack.pop();
                    if (healths[i] > healths[i2]) {
                        healths[i2] = 0;
                        healths[i] -= 1;
                        stack.push(i);  // current robot remains in the stack for further collisions
                    } else if (healths[i] < healths[i2]) {
                        healths[i] = 0;
                        healths[i2] -= 1;
                        stack.push(i2);  // previous robot remains in the stack for further collisions
                    } else {
                        healths[i] = 0;
                        healths[i2] = 0;
                    }
                }
                if (healths[i] > 0) {
                    stack.push(i);  // current robot remains in the stack as it survived the collisions
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int health : healths) {
            if (health > 0) {
                result.add(health);
            }
        }
        return result;
    }
}
