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
    public int rangeSumBST(TreeNode root, int low, int high) {
        TreeNode copy=root; 
        int resultat=calculSum(root,low,high,0);
        return resultat;
        
    }
    public int calculSum(TreeNode root,int low,int high,int sum)
    {  
        if(root==null) return sum;
        
         if(root.val<=high && root.val>=low) 
         { 
             sum=sum+root.val;
         }
        
               
            sum=calculSum(root.left,low,high,sum) ;
            sum=calculSum(root.right,low,high,sum);
        return sum;
    }
}