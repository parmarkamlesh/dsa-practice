class Solution {
  public List<Integer> luckyNumbers (int[][] matrix) {
        
        int[] minMatrixEachRow = new int[matrix.length];
        int[] maxMatrixEachColumn = new int[matrix[0].length];
        
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        
        for(int i=0; i< matrix.length;i++)
        {
               minElement = Integer.MAX_VALUE ;
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j]< minElement)
                {
                    minElement = matrix[i][j];
                }
            }
            minMatrixEachRow[i] = minElement ;
        }
        
        for(int i=0; i< matrix[0].length;i++)
        {
            maxElement = Integer.MIN_VALUE ;  
            
            for(int j=0; j< matrix.length; j++){
                if(matrix[j][i]> maxElement)
                {
                    maxElement = matrix[j][i];
                }
            }
            maxMatrixEachColumn[i] = maxElement ;
        }
        
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i< minMatrixEachRow.length ; i++){
            for(int j=0; j< maxMatrixEachColumn.length ;j++)
            {
             if(minMatrixEachRow[i] == maxMatrixEachColumn[j]){
                 ans.add(minMatrixEachRow[i]);
             }   
            } 
        }
        return ans;
                
    }
}