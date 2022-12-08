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
    public int goodNodes(TreeNode root) {
        //depth first method 
        if(root==null) return 0;
        TreeNode copy=root;
        int count=0;
        count=depthFirst(root,Integer.MIN_VALUE);
        return count;
        
    }
    public int depthFirst(TreeNode root,int max_val)
    {
        int amount=0;
        if (root==null) return 0;
        
        if(root.val>=max_val)
        {
            amount++;
            max_val=root.val;
        }
        amount+=depthFirst(root.left,max_val);
        amount+=depthFirst(root.right,max_val);
        return amount;
       
       
            
        }
    }
