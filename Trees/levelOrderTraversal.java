import java.util.*;
public class levelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Performing level order traversal
        List<List<Node>> result = level_order_traversal(root);

        // Printing the level order traversal result
        for (List<Node> level : result) {
            for (Node node : level) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }


    public static List<List<Node>> level_order_traversal(Node node){
        List<List<Node>> resList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>(); 

        if(node==null){
            return resList;
        }
queue.offer(node);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Node> list = new ArrayList<>();

            for(int i=0;i<len;i++){
                Node curr = queue.poll();
                if(curr!=null){
                    list.add(curr);
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            if(!list.isEmpty()){
                resList.add(list);
            }
        }
        return resList;
    }
}
