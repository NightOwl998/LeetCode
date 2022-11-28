class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] positions={Integer.MAX_VALUE,-1};
         boolean found = false;
        
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {    found=true;
                if(i<positions[0])
                {
                    positions[0]=i;
                }
                if(i>positions[1])
                {
                    positions[1]=i;
                }
            }
        }
      
        if(!found)
        {
            positions[0]=positions[1]=-1;
        }
  return positions;
}
}