class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int start=0;
        int end=0;
        int prod=nums[0];
        int counter=0;
        while(start<nums.length && end<nums.length)
        {
            if(prod<k)
            {
                end++;
                if(end>=start)
                {
                    counter+=end-start;
                }
                if(end<nums.length)
                {
                    prod*=nums[end];
                }
                
            }
            else
            {
                prod/=nums[start];
                start++;
            }
        }
        return counter;
    }
}