import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
/*
             1
           /   \
          2     3
         / \   / \
        4   5 6   7
 */

public class PostOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> list = postOrderTraversal(root);
        for(int i:list){
            System.out.print(i+ " ");
        }
    }
    public static List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> postOrderList = new ArrayList<>();
        postOrder(root, postOrderList);
        return postOrderList;
    }

    private static void postOrder(TreeNode node, List<Integer> preOrderList) {
        if(node == null){
            return;
        }
        postOrder(node.left, preOrderList);
        postOrder(node.right, preOrderList);
        preOrderList.add(node.val);
    }
}
