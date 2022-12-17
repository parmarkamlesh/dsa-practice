class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
        int sum = 0;
        for (int col = 0; col < grid[0].length; col++) {
            int max = 0;
            for (int row = 0; row < grid.length; row++) {
                if (grid[row][col] > max) {
                    max = grid[row][col];
                }
            }
            sum += max;
        }
        return sum;
    }
}