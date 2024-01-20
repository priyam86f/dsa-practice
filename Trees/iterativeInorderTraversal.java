import java.util.*;

public class iterativeInorderTraversal {
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

       System.out.println(interative_inorder(root));
    }



    public static List<Integer> interative_inorder(Node root){
        Node curr = root;
        
      List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            list.add(curr.data);
            curr=curr.right;

        }
        return list;
    }
}

