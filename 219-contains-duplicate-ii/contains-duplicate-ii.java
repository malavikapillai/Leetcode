class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {

        // brute-force approach

    //     int n=nums.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(nums[i]==nums[j])
    //             {
    //                 if(Math.abs(i-j)<=k)
    //                 {
    //                     return true;
    //                 }
    //             }
    //         }
    //     }

    // return false;

    int n=nums.length;    

    HashMap<Integer ,Integer> map= new HashMap<>();
    for(int i=0;i<n;i++)
    {
        int temp=nums[i];
        int oldcount;
        if(map.containsKey(temp))
        {

            oldcount=map.get(temp);
            if(Math.abs(i-oldcount)<=k)
            {
                return true;
            }
            map.put(temp,i);

        }
        else
        {
            map.put(temp,i);
        }

    }




    return false;
    }
  
}