class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }
        
        System.out.println(set);
        if(nums.length != set.size()) {
            return true;
        } 
     return false;

    }
}