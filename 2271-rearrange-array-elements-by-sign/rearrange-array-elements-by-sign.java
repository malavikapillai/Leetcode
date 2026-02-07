class Solution {
    public int[] rearrangeArray(int[] nums) {

        int arr[]=new int[nums.length/2];
        int arr1[]=new int[nums.length/2];
        int arr2[]=new int[nums.length];
        int j=0,k=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                arr[k]=nums[i];
                k++;
            }
            else
            {
                arr1[j]=nums[i];
                j++;

            }
        }
        int m=0,n=0;
        for(int l=0;l<nums.length;l=l+2)
        {
            arr2[l]=arr1[n];
            arr2[l+1]=arr[m];
            m++;
            n++;

        }
        return arr2;

        
    }
}