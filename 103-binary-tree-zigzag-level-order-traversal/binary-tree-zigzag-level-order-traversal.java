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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        Stack<Integer> stk=new Stack<>();
        boolean flag=false;
        while(!q.isEmpty())
        {
            List<Integer>currlevel =new LinkedList<>();
            int size=q.size();
            while(size>0)
            {
                TreeNode curr=q.poll();
                if(flag)
                {
                    stk.add(curr.val);
                }
                else
                {
                    currlevel.add(curr.val);   
                }
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                size--;
            }
                
            while(!stk.isEmpty())
            {
                currlevel.add(stk.pop());
            }
            result.add(currlevel);
            flag=!flag;
            


        }
        return result;




    }
}