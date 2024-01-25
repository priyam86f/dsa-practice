import java.util.*;
public class iterativePreOrder {
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

        List<Integer> res = iterative_PreOrder_traversal(root);
        System.out.println(res);
    }

    public static List<Integer> iterative_PreOrder_traversal(Node root){
        List<Integer> result_list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                result_list.add(curr.data);
                stack.push(curr.right);
                curr=curr.left;
            }
            curr = stack.pop();
            
        }
        return result_list;
    }
}
