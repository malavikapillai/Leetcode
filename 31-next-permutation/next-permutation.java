class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        // STEP 1 — find pivot
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                pivot = i - 1;
                break;
            }
        }

        // if no pivot → reverse whole array and STOP
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // STEP 2 — swap with next greater
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, pivot, i);
                break;
            }
        }

        // STEP 3 — reverse suffix
        reverse(nums, pivot + 1, n - 1);
    }

    public void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int nums[], int start, int end) {
        while (start < end) {   // better condition
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
