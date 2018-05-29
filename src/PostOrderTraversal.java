import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
    public ArrayList<Integer> traverseRecursive(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        helper(root,output);
        return output;
    }

    public ArrayList<Integer> traverseIterative(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while(!s1.isEmpty()) {
           Node temp = s1.pop();
           s2.push(temp);
           if(temp.left != null) {
               s1.push(temp.left);
           }
           if(temp.right != null) {
               s1.push(temp.right);
           }
        }

        while(!s2.isEmpty()){
            output.add(s2.pop().data);
        }
        return output;
    }

    private void helper(Node root, ArrayList<Integer> output) {
        if(root == null) return;
        helper(root.left, output);
        helper(root.right, output);
        output.add(root.data);
    }
}
