class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     //   System.out.println(mat.length+" "+mat[0].length);
        if(mat.length*mat[0].length==(r*c)){
            int m=mat.length; //num of row
            int n=mat[0].length; //num of col
                
            int[][] opmat=new int[r][c];
            int row=0;
            int col=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    opmat[row][col]=mat[i][j];                
                    col++;
                    if(col>c-1){
                        col=0;
                        row++;
                    }
                }
            }
            return opmat;
        }else{
            //invalid mat
            return mat;
        }
    }
}