import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisPreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> list = preOrder(root);
        for(int i:list){
            System.out.print(i+ " ");
        }
    }

    private static List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while(cur != null){
            if(cur.left == null) {
                list.add(cur.val);
                cur = cur.right;
            }
            else {
                TreeNode prev = cur.left;
                while(prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = cur;
                    list.add(cur.val);
                    cur = cur.left;
                }
                else {
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return list;
    }
}
