class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) 
            return false;
        
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        int currRow=matrix.length-1;
        int currCol=0;
        
        while(currRow>=0 && currCol<cols){
            int currentElem=matrix[currRow][currCol];
            if(target==currentElem)
                return true;
            if(target<currentElem)
                currRow--;
            else
                currCol++;
        }
        return false;
    }
}