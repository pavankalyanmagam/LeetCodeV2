class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0)
            return "";

        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while(i >= 0){
            // 1. Skip spaces
            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

            // 2. Find end of word
            int j = i;

            // 3. Find start of word
            while(i >=0 && s.charAt(i) != ' ') {
                i--;
            }
            // 4. Append word
            sb.append(s.substring(i + 1, j + 1));

            // 5. Append space if more words exist
            sb.append(" ");

        }
        return sb.toString().trim();
    }
}