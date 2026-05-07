/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
            return match(s, p, 0, 0);
        }
    private boolean match(String s, String p, int i, int j) {

        // Pattern finished
        if (j == p.length()) {
            return i == s.length();
        }

        // Check if current characters match
        boolean firstMatch = (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        // If next character in pattern is '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Two choices:
            // 1. Ignore x* completely
            // 2. Use x* if first character matches
            return match(s, p, i, j + 2) ||
                   (firstMatch && match(s, p, i + 1, j));
        }

        // Normal character match
        return firstMatch && match(s, p, i + 1, j + 1);
    }
}
// @lc code=end

