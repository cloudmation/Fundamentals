import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LevelOrderTraversalTest {
    @Test
    public void testInOrderTraversalRecursive() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        ArrayList<Integer> results = traversal.traverse(root);
        Assert.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, Utility.convertIntegers(results));
    }
}
