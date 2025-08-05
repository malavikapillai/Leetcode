class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int maxarea=0;
        int right=height.length-1;
        while(left<right)
        {
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int area=h*w;
            maxarea=Math.max(maxarea,area);

            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return maxarea;
        
    }
}