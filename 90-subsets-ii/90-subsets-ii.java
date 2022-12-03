class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,list,new ArrayList<>());
        return list;
    }
    public void backtrack(int[] nums,int index,List<List<Integer>> list, List<Integer> tempList)
    {
        list.add(new ArrayList<>(tempList));
        for(int i=index;i<nums.length;i++)
        {   if(i>index && nums[i]==nums[i-1]) continue; // it is a duplicate
            tempList.add(nums[i]);
            backtrack(nums,i+1,list,tempList);
            tempList.remove(tempList.size()-1);
            
        }
    }
}