import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort array
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Step 2: Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Step 3: Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // Step 4: Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return res;
    }
}
