class Solution {
    public int majorityElement(int[] nums) {
        
        int vote=0;
        int majo=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(vote==0)
            {
                majo=nums[i];  
            }
            if(nums[i]==majo)
            {
                vote++;
            }
            else
            {
                vote--;
            }
        }
        return majo;
    }
}