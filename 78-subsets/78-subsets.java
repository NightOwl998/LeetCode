class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        backtrack (list,new ArrayList<>(),nums,0);
        return list;
        
    }
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int index)
    {
        list.add(new ArrayList<>(tempList));
        for(int i=index;i<nums.length;i++)
        {
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
            
        }
    }
    
}