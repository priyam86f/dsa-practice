public class postorderTraversal {
    int data;
    postorderTraversal right;
    postorderTraversal left;

    public postorderTraversal(int key) {
        data = key;
    }

    public static void function_postorder_traversal(postorderTraversal node) {
        if (node == null) {
            return;
        }

        
        function_postorder_traversal(node.left);
        function_postorder_traversal(node.right);
        System.out.println(node.data + " ");

    }

    public static void main(String[] args) {
        postorderTraversal root = new postorderTraversal(1);
        root.left = new postorderTraversal(2);
        root.right = new postorderTraversal(3);
        root.left.left = new postorderTraversal(4);
        root.left.right = new postorderTraversal(5);
        root.left.right.left = new postorderTraversal(8);
        root.right.left = new postorderTraversal(6);
        root.right.right = new postorderTraversal(7);
        root.right.right.left = new postorderTraversal(9);
        root.right.right.right = new postorderTraversal(10);

        function_postorder_traversal(root);
    }

}
