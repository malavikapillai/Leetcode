class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            currsum+=nums[i];
            if(map.containsKey(currsum-k))
            {
                count+=map.get(currsum-k);
            }
            // if(map.containsKey(currsum))
            // {
            //     int oc=map.get(currsum);
            //     map.put(currsum,oc+1);
            // }
            // else
            // {
            //     map.put(currsum,1);
            // }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return count;
        

        
       
    }
}