package binarytreetraversal;

/** Depth-first traversals of a binary tree. */
public class Traversal {

    /** Root, Left, Right. */
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    /** Left, Root, Right. */
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    /** Left, Right, Root. */
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    /** Right, Left, Root (mirror of post-order). */
    public void reversePostOrder(Node node) {
        if (node == null) {
            return;
        }
        reversePostOrder(node.right);
        reversePostOrder(node.left);
        System.out.print(node.value + " ");
    }
}
