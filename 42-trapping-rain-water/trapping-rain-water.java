class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //left max boundary

        int leftmax[] = new int[n];//new array
        leftmax[0] = height[0]; //first element always the same.

        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
            //compare the current height and the previous height to find which is the max left boundary.

        }

        //right max boundary

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1]; //last element--we go from backward and its right boundary is that itself.

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);

        }
        //loop---
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            //water level= min(left max,right max)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //trapped water=water level-height
            trappedwater+= waterlevel - height[i];
        }
        return trappedwater;

    }
}