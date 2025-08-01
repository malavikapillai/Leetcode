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
    public int minDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int lefth=minDepth(root.left);
        int righth=minDepth(root.right);

        if(root.left==null || root.right==null)
        {
            return 1+lefth+righth;
        }
        return  1+ Math.min(lefth,righth);
        
    }
}