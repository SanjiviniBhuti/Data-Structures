import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> list = preOrderTraversalItr(root);
        for(int i:list){
            System.out.print(i+ " ");
        }
    }

    private static List<Integer> preOrderTraversalItr(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null){
            return list;
        }
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            list.add(node.val);
            if(node.right != null) {
                st.push(node.right);
            }
            if(node.left != null) {
                st.push(node.left);
            }
        }
        return list;
    }
}
