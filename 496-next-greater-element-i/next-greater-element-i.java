class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();

        // Step 1: Build map of next greater for elements in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // If stack is empty, no greater element
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            nextGreaterMap.put(current, nextGreater);

            stack.push(current);
        }

        // Step 2: Build result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}