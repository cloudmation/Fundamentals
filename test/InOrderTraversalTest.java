import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InOrderTraversalTest {
    @Test
    public void testInOrderTraversalRecursive() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        BinaryTreeTraversal traversal = new InOrderTraversal();
        ArrayList<Integer> results = traversal.recursive(root);
        Assert.assertArrayEquals(new int[] {2,1,4,3}, Utility.convertIntegers(results));

    }

    @Test
    public void testInOrderTraversalIterative() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BinaryTreeTraversal traversal = new InOrderTraversal();
        ArrayList<Integer> results = traversal.iterative(root);
        Assert.assertArrayEquals(new int[] {4, 2, 5, 1, 6, 3,7}, Utility.convertIntegers(results));

    }

}
