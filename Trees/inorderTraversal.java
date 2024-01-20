import org.w3c.dom.Node;

public class inorderTraversal {
    int data;
    inorderTraversal right;
    inorderTraversal left;

    public inorderTraversal(int key) {
        data = key;
    }

    public static void function_inorder_traversal(inorderTraversal node) {
        if (node == null) {
            return;
        }

        function_inorder_traversal(node.left);

        System.out.println(node.data + " ");

        function_inorder_traversal(node.right);
    }

    public static void main(String[] args) {
        inorderTraversal root = new inorderTraversal(1);
        root.left = new inorderTraversal(2);
        root.right = new inorderTraversal(3);
        root.left.left = new inorderTraversal(4);
        root.left.right = new inorderTraversal(5);
        root.left.right.left = new inorderTraversal(8);
        root.right.left = new inorderTraversal(6);
        root.right.right = new inorderTraversal(7);
        root.right.right.left = new inorderTraversal(9);
        root.right.right.right = new inorderTraversal(10);

        function_inorder_traversal(root);
    }

}