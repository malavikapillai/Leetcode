class Solution {
    int max = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        // Step 1: Find the max possible OR
        for (int num : nums) {
            max |= num;
        }

        // Step 2: Use backtracking to count subsets that OR to max
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int index, int or) {
        if (index == nums.length) {
            if (or == max) {
                count++;
            }
            return;
        }

        // Include current element
        dfs(nums, index + 1, or | nums[index]);

        // Exclude current element
        dfs(nums, index + 1, or);
    }
}
