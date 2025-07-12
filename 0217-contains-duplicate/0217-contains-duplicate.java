class Solution {
    public boolean containsDuplicate(int[] nums) {
        // nums = [1,2,3,4]
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++ ) {
            if(nums[i] == nums[i-1]) return true;
           
        }
        return false;
    }
}