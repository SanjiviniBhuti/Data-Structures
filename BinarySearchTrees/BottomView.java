import java.util.*;

public class BottomView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> list = bottomView(root);
        for(int i:list){
            System.out.print(i+ " ");
        }
    }

    private static List<Integer> bottomView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> mpp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        if(root == null) {
            return list;
        }
        q.add(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode node = pair.key;
            Integer level = pair.value;

            mpp.put(level, node.val);

            if(node.left != null){
                q.add(new Pair(node.left, level-1));
            }
            if(node.right != null){
                q.add(new Pair(node.right, level+1));
            }
        }
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}
