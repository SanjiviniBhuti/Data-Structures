import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
             1
           /   \
          2     3
         / \   / \
        4   5 6   7
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> lists = levelOrderTraversal(root);
        for(List list:lists){
            for(Object i:list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> levelOrderlist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return levelOrderlist;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> inner = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr = queue.poll();
                inner.add(curr.val);
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
            levelOrderlist.add(inner);
        }
        return levelOrderlist;
    }
}
