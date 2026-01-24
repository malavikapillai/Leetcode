class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int right=nums.length-1;
        int left=0;
        int sum=0;
        int maxsum=0;

        while(left<right)
        {
            sum=nums[left]+nums[right];
            maxsum=Math.max(maxsum,sum);
            left++;
            right--;


        }
        return maxsum;
        
    }
}