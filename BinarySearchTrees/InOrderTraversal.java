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

public class InOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> list = inOrderTraversal(root);
        for(int i:list){
            System.out.print(i+ " ");
        }
    }
    public static List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> inOrderList = new ArrayList<>();
        inOrder(root, inOrderList);
        return inOrderList;
    }

    private static void inOrder(TreeNode node, List<Integer> preOrderList) {
        if(node == null){
            return;
        }
        inOrder(node.left, preOrderList);
        preOrderList.add(node.val);
        inOrder(node.right, preOrderList);
    }
}
