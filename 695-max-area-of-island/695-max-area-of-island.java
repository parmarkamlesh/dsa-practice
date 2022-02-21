class Solution {
	public int maxAreaOfIsland(int[][] grid) {
		int count = 0;
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[0].length; j++) {
				if (grid[i][j] == 1) {
					count = Math.max(count, island(i, j, grid));
				}
			}
		}
		return count;
	}
	public static int island(int i, int j, int[][] grid) {
		if (i<0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) 
            return 0;

		grid[i][j] = 0;
		return 1 + 
                   island(i - 1, j, grid) +
                   island(i + 1, j, grid) +
			       island(i, j + 1, grid) + 
                   island(i, j - 1, grid);

	}
}