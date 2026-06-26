/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int[] idx= new int[height.length] 
        int max_h=0 ;
        int idx =-1;
        for (int i=0;i< height.length;i++)
            idx[i] = i;

        sort(height, idx, 0, idx.length)

        int area = 0;
        for (int i = adx.lenght-1; i>=1;i--)
        {
            
        }


    }

    public int partition(int[] a, int [] b, int l , int h)
    {
        int pivot = a[h];
        int i= l-1;
        for (int j=l;j<h;j++)
        {
            if(a[j]>pivot)
            {
                i++;
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;

                temp = = b[i];
                b[i]=b[j];
                b[j]=temp;
            }
        }

        int temp = a[i+1]
        a[i+1]=a[h]
        a[h]= temp;

        int temp = b[i+1]
        b[i+1]=b[h]
        b[h]= temp;

        return i+1;
    }

    void sort(int[] a, int [] b, int l , int h)
    {
        if(l<h)
        {
            int pi = partition(a,b,l,h);

            sort(a,b,l,pi-1);
            sort(a,b,l,pi-1);
        }
    }
}
// @lc code=end

