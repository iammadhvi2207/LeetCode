/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();
        int i = 0;
        boolean down = false;

        for (char ch : s.toCharArray()) {
            rows[i].append(ch);

            if (i == 0 || i == numRows - 1)
                down = !down;

            i += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows)
            result.append(row);

        return result.toString();
    }
}
// @lc code=end

