class Solution {
    
    int n,m;
    public int numIslands(char[][] grid) {
        
        
         n=grid.length;
        if(n==0)
            return 0;
        m=grid[0].length;
        int count=0;
        
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1'){
                dfsmarking(grid,i,j);
                count++;
                }
            }
           return count;     
    }
    
    public void dfsmarking(char[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='1')
            return;
        grid[i][j]='0';
        dfsmarking(grid,i+1,j);
        dfsmarking(grid,i-1,j);
        dfsmarking(grid,i,j+1);
        dfsmarking(grid,i,j-1);
    
    }
}