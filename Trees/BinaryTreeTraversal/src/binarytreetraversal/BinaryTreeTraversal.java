package binarytreetraversal;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        root.left.left.left = new Node(1);

        Traversal traversal = new Traversal();

        System.out.print("Preorder Traversal      : ");
        traversal.preOrder(root);
        System.out.println();

        System.out.print("Inorder Traversal       : ");
        traversal.inOrder(root);
        System.out.println();

        System.out.print("Postorder Traversal     : ");
        traversal.postOrder(root);
        System.out.println();

        System.out.print("Reverse Post Traversal  : ");
        traversal.reversePostOrder(root);
        System.out.println();
    }
}
