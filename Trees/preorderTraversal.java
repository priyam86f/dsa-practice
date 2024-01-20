public class preorderTraversal {
    int data;
    preorderTraversal right;
    preorderTraversal left;

    public preorderTraversal(int key) {
        data = key;
    }

    public static void function_preorder_traversal(preorderTraversal node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data + " ");
        function_preorder_traversal(node.left);
        function_preorder_traversal(node.right);

    }

    public static void main(String[] args) {
        preorderTraversal root = new preorderTraversal(1);
        root.left = new preorderTraversal(2);
        root.right = new preorderTraversal(3);
        root.left.left = new preorderTraversal(4);
        root.left.right = new preorderTraversal(5);
        root.left.right.left = new preorderTraversal(8);
        root.right.left = new preorderTraversal(6);
        root.right.right = new preorderTraversal(7);
        root.right.right.left = new preorderTraversal(9);
        root.right.right.right = new preorderTraversal(10);

        function_preorder_traversal(root);
    }

}
