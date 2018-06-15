import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PreOrderTraversalTest {
    @Test
    public void testPreOrderTraversalRecursive() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        BinaryTreeTraversal traversal = new PreOrderTraversal();
        ArrayList<Integer> results = traversal.recursive(root);
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Utility.convertIntegers(results));
    }

    @Test
    public void testPreOrderTraversalIterative() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        BinaryTreeTraversal traversal = new PreOrderTraversal();
        ArrayList<Integer> results = traversal.iterative(root);
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Utility.convertIntegers(results));
    }
}
