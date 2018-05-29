import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal implements BinaryTreeTraversal{

    @Override
    public ArrayList<Integer> recursive(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        preorderRecursiveHelper(root, output);
        return output;
    }

    @Override
    public ArrayList<Integer> iterative(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()) {
            Node node = nodeStack.pop();
            output.add(node.data);
            System.out.println("Add node: " + node.data);

            if(node.right != null) {
                nodeStack.push(node.right);
            }

            if(node.left != null) {
                nodeStack.push(node.left);
            }
        }
        return output;
    }


    private void preorderRecursiveHelper(Node root, ArrayList<Integer> output) {
        if(root == null) return;
        output.add(root.data);
        System.out.println("add: " + root.data);
        preorderRecursiveHelper(root.left, output);
        preorderRecursiveHelper(root.right, output);
    }
}
