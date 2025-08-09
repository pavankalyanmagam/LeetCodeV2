class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0;
		while(i < nums.length - 1) {
			int sum = 0;
				sum = sum + nums[i];
				nums[i+1] = sum + nums[i+1];
				i++;
		}
		return nums;
    }
}