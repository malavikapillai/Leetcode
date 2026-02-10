class Solution {
    public int search(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }

        int pivot=end;
        int left=binary(nums,0,pivot-1,target);
        if(left!=-1) return left;
        int right=binary(nums,pivot,n-1,target);
        return right;

    }
    public int binary(int nums[],int start,int end,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return -1;
    }
}