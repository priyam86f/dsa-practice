import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativePostOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right= new Node(5);
       root.left.right.left = new Node(8);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
       root.right.right.left=new Node(9);
       root.right.right.right=new Node(10);
       List<Integer> res = postorderTraversal(root);
       System.out.println(res);

    }



    public static List<Integer> postorderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        Stack<Boolean> visit = new Stack<>();
        List<Integer> res = new ArrayList<>();

        stack.push(root);
        visit.push(false);

        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            boolean v = visit.pop();

            if (cur != null) {
                if (v) {
                    res.add(cur.data);
                } else {
                    stack.push(cur);
                    visit.push(true);
                    stack.push(cur.right);
                    visit.push(false);
                    stack.push(cur.left);
                    visit.push(false);
                }
            }
        }
        return res;
}
}