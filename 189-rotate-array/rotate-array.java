class Solution {
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);//revrse full array
        reverse(nums,0,k-1);//reverse the first k element
        reverse(nums,k,n-1);//s;everse the last k elements 
    }
    public static void  reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}