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
   /* public class Pair
                {
                    public Integer key;
                    public List<Integer> list;

                    public Pair(Integer key, List<Integer> list)
                     {
                            this.key = key;
                            this.list = list;
                     }

                 }*/

    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        else
        {
            return bfs(root,root.val,root.val);
        }
    }
    public int bfs(TreeNode root,int min,int max)
    {
        if(root==null) return 0;
        int temp=Math.max(Math.abs(root.val-max),Math.abs(root.val-min));
        temp=Math.max(temp,bfs(root.left,Math.min(min,root.val),Math.max(max,root.val)));
        temp=Math.max(temp,bfs(root.right,Math.min(min,root.val),Math.max(max,root.val)));
        return temp;
    }
        
      /*  // we consider one generation meaning for each node consider children and grandchildren 
        //find family tree
        List<Pair> map= new ArrayList<Pair>();
        int max_value=Integer.MIN_VALUE;
        bfs(root,map);    
        
        for(Pair element:map)
        {
            int el=element.key;
            List<Integer> list=element.list;
            if(!list.isEmpty())
            {
            
            
                int differnce=Math.abs(el-Collections.min(list));
                if (differnce>max_value) max_value=differnce;
                differnce=Math.abs(el-Collections.max(list));
                if (differnce>max_value) max_value=differnce;
            }
                
            
        }
        
        return  max_value;
        
    }
    public void getKids(TreeNode element,List<Integer> list,int min,int max)
    {
        if (element==null) return;
         if(element.left!=null) 
         {
             list.add((element.left).val);
         }
         if(element.right!=null) 
         {
             list.add((element.right).val); 
         }
        getKids(element.left,list);
        getKids(element.right,list);
    }
    
   /* public void getKids(TreeNode element,List<Integer> list)
    {
        if (element==null) return;
        //these are the childre, of element
       if(element.left!=null) 
       {
           list.add((element.left).val);
            if((element.left).left!=null) list.add(((element.left).left).val);
           if((element.left).right!=null) list.add(((element.left).right).val);
       }
       if(element.right!=null) 
       {
           list.add((element.right).val); 
            if((element.right).left!=null) list.add(((element.right).left).val);
           if((element.right).right!=null) list.add(((element.right).right).val);
       }
       
       
    }*/
    
  /*  public void  bfs(TreeNode root,List<Pair> map)
    {
        List<Integer> list=new ArrayList<>();
        if(root==null) return ;
        getKids(root,list);
        Pair element=new Pair(root.val,list);
        map.add(element);
        bfs(root.left,map);
        bfs(root.right,map);
        
        
    }*/
}