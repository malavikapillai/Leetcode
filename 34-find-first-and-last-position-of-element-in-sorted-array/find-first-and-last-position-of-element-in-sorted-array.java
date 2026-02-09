class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left=leftbound(nums,target);
        int right=rightbound(nums,target);
        return new int[]{left,right};  
    }

    public int leftbound(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                index=mid;
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return index;
    }

    public int rightbound(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                index=mid;
                start=mid+1;

            }
            else if(target>=nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return index;
    }
}