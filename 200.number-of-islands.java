/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    int count =0;

    public void BFS(char[][] grid)
    {
        Queue<int []> traverse = new ArrayDeque<>();

        for (int i= 0; i< grid.length;i++)
        {
            for (int j=0;j< grid[i].length;j++)
            {

                if(grid[i][j]=='1')
                {
                    count ++ ;
                    traverse.offer(new int[]{i,j});
                    grid[i][j]='0';
                    while(!traverse.isEmpty())
                    {
                        int[] curr = traverse.poll();
                        int row = curr[0];
                        int col = curr[1];
                        if(row != grid.length-1 && grid[row+1][col]=='1' )
                        {
                            traverse.offer(new int[]{row+1,col});
                            grid[row+1][col]='0';
                        }
                        if(row!=0 && grid[row-1][col]=='1')
                        {
                            traverse.offer(new int[]{row-1,col});
                            grid[row-1][col]='0';
                        }
                        if(col != grid[i].length-1 && grid[row][col+1]=='1')
                        {
                            traverse.offer(new int[]{row,col+1});
                            grid[row][col+1]='0';
                        }
                        if(col != 0 && grid[row][col-1]=='1')
                        {
                            traverse.offer(new int[]{row,col-1});
                            grid[row][col-1]='0';
                        }

                    }

                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        
        count =0;
        BFS(grid);

        return count;
    }
}
// @lc code=end

