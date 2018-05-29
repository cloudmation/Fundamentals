import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal implements BinaryTreeTraversal {

    @Override
    public ArrayList<Integer> iterative(Node root) {
        if(root == null) return null;
        ArrayList<Integer> output = new ArrayList<>();
        //keep the nodes in the path that are waiting to be visited
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
        while (node != null) {
            stack.push(node);
            System.out.println("pushing: " + node.data);
            node = node.left;
        }

        while(!stack.isEmpty()) {
            node = stack.pop();
            System.out.println("poping: " + node.data);
            output.add(node.data);
            if(node.right != null) {
                node = node.right;
                while(node != null) {
                    stack.push(node);
                    System.out.println("pushing: " + node.data);
                    node = node.left;
                }
            }
        }
        return output;
    }

    @Override
    public ArrayList<Integer> recursive(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        inorderRecursiveHelper(root, output);
        return output;
    }

    private void inorderRecursiveHelper(Node root, ArrayList<Integer> output) {
        if(root == null) return;
        inorderRecursiveHelper(root.left, output);
        output.add(root.data);
        inorderRecursiveHelper(root.right, output);
    }
}
