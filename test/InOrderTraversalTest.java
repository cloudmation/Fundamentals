import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InOrderTraversalTest {
    @Test
    public void testInOrderTraversalRecursive() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        InOrderTraversal traversal = new InOrderTraversal();
        ArrayList<Integer> results = traversal.inorderRecursive(root);
        Assert.assertArrayEquals(new int[] {2,1,4,3}, Utility.convertIntegers(results));

    }

    @Test
    public void testInOrderTraversalIterative() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        InOrderTraversal traversal = new InOrderTraversal();
        ArrayList<Integer> results = traversal.inorderIterative(root);
        Assert.assertArrayEquals(new int[] {2,1,4,3, 5}, Utility.convertIntegers(results));

    }

}
