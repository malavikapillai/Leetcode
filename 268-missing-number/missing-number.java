class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            int t=nums[i];
            arr[t]=1;
        }
        for(int i=1;i<n+1;i++)
        {
            if(arr[i]==0)
            {
                return i;
            }
        }
        return 0;
        
    }
}