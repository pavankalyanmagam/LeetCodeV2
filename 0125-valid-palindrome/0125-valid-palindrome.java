class Solution {
    public boolean isPalindrome(String s) {
        // Step -1: Initialize two pointers
        int left =0, right = s.length()-1;

        // Step -2: Check palindrom property with skipping non-alphanumeric
        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // skip invalid character from the left
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
            }
            // skip invalid character from the right
            else if(!Character.isLetterOrDigit(rightChar)) {
                right--;
            }
            // Compare characters in a case-insensitive manner
            else if(Character.toLowerCase(leftChar) == Character.toLowerCase(rightChar)) {
                left++;
                right--;
            }
            // mismatch found -> not a palindrome
            else {
                return false;
            }
        }
        // Valid Palindrome
        return true;
    }

}