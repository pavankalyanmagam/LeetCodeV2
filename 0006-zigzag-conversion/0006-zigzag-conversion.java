class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if only 1 row, no zigzag needed
        if(numRows ==1 || s.length() <= numRows) {
            return s;
        }

        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i =0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = true;

        // Place each character in correct row
        for(char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction at top or bottom
            if(currentRow == 0) {
                goingDown= true;
            } else if(currentRow == numRows - 1) {
                goingDown = false;
            }

            // Move row pointer
            if(goingDown){
                currentRow++;
            } else {
                currentRow--;
            }
        }
        // Combine all rows
        StringBuilder result = new StringBuilder();
        for(StringBuilder row: rows) {
            result.append(row);
        }
        return  result.toString();
    }
    
}