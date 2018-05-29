import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// BFS
public class LevelOrderTraversal {

    public ArrayList<Integer> traverse(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        LinkedList<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            Node temp = nodeQueue.pollFirst();
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
