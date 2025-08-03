class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            if(set.contains(nums1[i]))
            {
                continue;
            }
            set.add(nums1[i]);
        }
        int j=0;
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
                arr[j]=nums2[i];
                set.remove(nums2[i]);
                j++;
            }

        }
        return Arrays.copyOf(arr,j);

        
    }
}