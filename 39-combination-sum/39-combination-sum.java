class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates,list,new ArrayList<>(),target,0);
        return list;
        
    }
    public void backtrack(int[] nums, List<List<Integer>> list,List<Integer> tempList,int left,int start)
    {
        if(left<0) return;
         else if(left==0){
            list.add(new ArrayList<>(tempList));
        }
        else
        {
            for(int i=start;i<nums.length;i++)
            {
                tempList.add(nums[i]);
                backtrack(nums,list,tempList,left-nums[i],i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}