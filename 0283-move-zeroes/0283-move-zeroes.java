class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Pointer for placing non-zero elements
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] !=0) {
                // Swap elements if right pointer finds a non-zero
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++; // Move left pointer forward
            }
        }
    }
}