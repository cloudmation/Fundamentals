import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// BFS
public class LevelOrderTraversal implements BinaryTreeTraversal {

    @Override
    public ArrayList<Integer> recursive(Node root) {
        return null;
    }

    @Override
    public ArrayList<Integer> iterative(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            Node temp = nodeQueue.poll();
            output.add(temp.data);
            if(temp.left != null) {
                nodeQueue.add(temp.left);
            }
            if(temp.right != null) {
                nodeQueue.add(temp.right);
            }
        }
        return output;
    }
}
