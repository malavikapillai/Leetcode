import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);  // null as level separator

        List<Integer> currentLevel = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null) {
                // End of one level
                result.add(new ArrayList<>(currentLevel));
                currentLevel.clear();

                // If there are still nodes left, add a new level marker
                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
            } else {
                currentLevel.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return result;
    }
}
