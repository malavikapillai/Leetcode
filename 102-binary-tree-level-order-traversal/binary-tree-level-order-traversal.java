/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; // edge case check

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            List<Integer> currLevel = new ArrayList<>();
            int size = q.size();

            while (size > 0) {
                TreeNode current = q.poll();
                currLevel.add(current.val); // use current.val, not current

                if (current.left != null) q.offer(current.left); // null check
                if (current.right != null) q.offer(current.right);

                size--;
            }

            result.add(currLevel); // add current level
        }

        return result;
    }
}
