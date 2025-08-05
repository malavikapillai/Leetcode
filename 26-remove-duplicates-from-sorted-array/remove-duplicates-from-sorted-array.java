class Solution {
    public int removeDuplicates(int[] nums) {



        // HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     set.add(nums[i]);

        // }
        // return set.size();

        // two  pointer approach

        if(n==0)
        {
            return 0;

        }
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];

            }
        }
        return i+1;




        
        
    }
}