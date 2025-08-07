class Solution {
    public int minSubArrayLen(int target, int[] nums) {

    
    //sliding window approach
    // Extending the window increases the sum.

// If the sum is too large, we can safely shrink the window from the left to try to find the smallest length.
int i=0; // start of the window
int n=nums.length;
int count=1;
int minlength=Integer.MAX_VALUE;

int sum=0;

for(int j=0;j<n;j++) // j is the end of the window
{
    sum+=nums[j];

//shrink the window
    while(sum>=target)
    {
        int length=j-i+1; // window size
        minlength=Math.min(length,minlength);
        sum=sum-nums[i];
        i++;

    }

}
return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    }
}
