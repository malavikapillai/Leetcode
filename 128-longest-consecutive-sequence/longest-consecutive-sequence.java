class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Step 1: Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Only check the start of a sequence
        for (int num : set) { // ✅ Loop over unique numbers only
            if (!set.contains(num - 1)) { // Only start if it's the beginning of a sequence
                int current = num;
                int count = 1;

                // Count how far the sequence goes
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
