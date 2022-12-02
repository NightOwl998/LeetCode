class Solution {
    public int maximumSwap(int num) {
		
		//create the integer array 
        int length = String.valueOf(num).length();
        int[] nums=new int[length]; 
        for(int i=0;i<length;i++)
        { 
            String el=String.valueOf(num);
            nums[i]=Integer.parseInt(String.valueOf(el.charAt(i)));
                        
        }
        int max=num;
        int[] copy= new int[length];
        System.arraycopy(nums,0,copy,0,length);
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                int temp=nums[j];
                copy[j]=nums[i];
                copy[i]=temp;
                if(toInt(copy) > max) max=toInt(copy);
                System.arraycopy(nums,0,copy,0,length);
                
            }
        }
        return max;
    }
       public int toInt(int[] nums)
       {
           int res=0;
           for(int i=0;i<nums.length;i++)
           {
               res=res*10+nums[i];
               
           }
           return res;
       }
    
}