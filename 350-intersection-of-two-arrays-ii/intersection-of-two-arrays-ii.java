class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                int count=map.get(nums1[i]);
                map.put(nums1[i],count+1);
            }
            else
            {
                map.put(nums1[i],1);
            }
        }
        int[] arr=new int[nums1.length];
        int j=0;
        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0)
            {
               
                arr[j]=nums2[i];
                j++;
                map.put(nums2[i],map.get(nums2[i])-1);

            }
        }
        return Arrays.copyOf(arr,j);

        
    }
}