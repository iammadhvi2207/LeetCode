/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start

import java.util.HashSet;

class Solution {

    public void backtrack(int row, Set<Integer> cols, Set<Integer> diags, Set<Integer> antiDiags, int n, char[][] game, List<List<String>> boards )
    {
        if(row == n)
        {
            List<String> board = new ArrayList<>();

            for(char[] r: game)
                board.add(new String(r));

            boards.add(board);
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

            game[row][col] = 'Q';
            cols.add(col);
            diags.add(diag);
            antiDiags.add(antiDiag);

            backtrack(row+1, cols, diags, antiDiags, n, game, boards);

            game[row][col] = '.';
            cols.remove(col);
            diags.remove(diag);
            antiDiags.remove(antiDiag);

        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> boards = new ArrayList<>();

        Set<Integer> col = new HashSet<>();
        Set<Integer> diag = new HashSet<>();
        Set<Integer> antiDiag = new HashSet<>();

        char[][] game = new char[n][n];
        for (int i = 0; i< n;i++)
            for(int j=0;j<n;j++)
                game[i][j] = '.';

        backtrack (0, col, diag, antiDiag, n, game, boards);

        return boards;
    }
}
// @lc code=end

