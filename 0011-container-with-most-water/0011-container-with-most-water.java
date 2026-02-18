class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        // Move pointers toward each other
        while ( left <= right) {
            int width = right - left; // Distance between lines
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * width; // Computer water contained

            maxArea = Math.max(maxArea, area); // Update max water

            // Move the pointer pointing to the shorter height
            if(height[left] < height[right]) {
                left++; // Move left pointer forward
            } else {
                right--; // Move the right pointer backward
            }
        }
        return maxArea;
    }
}