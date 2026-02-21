class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0, j = 0;

        // Iterate through both strings
        while(i < s.length() && j < t.length()) {
            // If characters match, move the pointer for s
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Alwasy move the pointer for t
            j++;
        }
        // If i is equal to the lenght of s, all characters of s were found in it
        return i == s.length();
    }
}