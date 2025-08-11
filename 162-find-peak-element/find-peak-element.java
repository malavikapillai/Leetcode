class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak is in the right half
                start = mid + 1;
            } else {
                // Peak is in the left half or at mid
                end = mid;
            }
        }

        // start == end is the peak element index
        return start;
    }
}
