class Solution {
    public String reverseWords(String s) {
        if(s == null) return "";
        if(s == null || s.trim().isEmpty()) {
            return "";
        }

        String[] sb1 = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i = sb1.length-1; i >= 0; i--){
            sb.append(sb1[i]);
            if(i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}