/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

// @lc code=start
class Solution {

    int count =0;

    public void backtrack(int row, Set<Integer> cols, Set<Integer> diags, Set<Integer> antiDiags, int n)
    {
        if(row == n)
        {
            count ++;
            return;
        }

        for (int col = 0; col<n;col++ )
        {
            if(cols.contains(col))
                continue;

            int diag = col - row;

            if(diags.contains(diag))
                continue;

            int antiDiag = col + row;

            if(antiDiags.contains(antiDiag))
                continue;

            cols.add(col);
            diags.add(diag);
            antiDiags.add(antiDiag);

            backtrack(row+1, cols, diags, antiDiags, n);

            cols.remove(col);
            diags.remove(diag);
            antiDiags.remove(antiDiag);

        }
    }

    public int totalNQueens(int n) {

        count =0;

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag = new HashSet<>();
        Set<Integer> antiDiag = new HashSet<>();

        backtrack (0, cols, diag, antiDiag, n);

        return count;
    }
}
// @lc code=end

