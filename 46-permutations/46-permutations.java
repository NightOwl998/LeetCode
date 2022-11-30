class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        backtrack(nums,list,new ArrayList<>());
        return list;      
        
    }
    public void backtrack(int[] nums,List<List<Integer>> list,List<Integer> tempList)
    {
        if(tempList.size()==nums.length)
        {
            list.add(new ArrayList<>(tempList));
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if((tempList.contains(nums[i]))) continue;
                tempList.add(nums[i]);           
                backtrack(nums,list,tempList);                
                tempList.remove(tempList.size()-1);
            }
        }
    }
}