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
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) {return result;}
        Deque<TreeNode> queue= new ArrayDeque<>();
        queue.add(root);
        while(!(queue.isEmpty()))
        {
            int size=queue.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++)
            {   TreeNode current_node=queue.removeFirst();
                level.add(current_node.val);
                if(current_node.left!=null)
                {
                    queue.addLast(current_node.left);
                }
                if(current_node.right!=null)
                {
                    queue.addLast(current_node.right);
                }
            }
            result.add(level);
        }
        return result;
        
    }
}