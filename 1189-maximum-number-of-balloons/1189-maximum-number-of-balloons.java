class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text == null || text.length() == 0) {
            return 0;
        }
        int[] count = new int[26];

        for(char c: text.toCharArray()) {
            count[c - 'a']++;
        }

       // Calculate the minimum number of "balloon" we can form
        int minBalloons = Integer.MAX_VALUE;
        
        // Check against required characters
        minBalloons = Math.min(minBalloons, count['b' - 'a']);
        minBalloons = Math.min(minBalloons, count['a' - 'a']);
        minBalloons = Math.min(minBalloons, count['l' - 'a'] / 2);
        minBalloons = Math.min(minBalloons, count['o' - 'a'] / 2);
        minBalloons = Math.min(minBalloons, count['n' - 'a']);
        
        return minBalloons;
    }
}