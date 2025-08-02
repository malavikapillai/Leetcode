class Solution {
    public int majorityElement(int[] nums) {
    // BOYER MOORE VOTING ALGO
    int majo=nums[0];
    int count=0;


    for(int i=0;i<nums.length;i++)
    {
        if(count==0)
        {
            majo=nums[i];
        }
        if(nums[i]==majo)
        {
            count++;
        }
        else
        {
            count--;
        } 
    }
    return majo;

    }
}