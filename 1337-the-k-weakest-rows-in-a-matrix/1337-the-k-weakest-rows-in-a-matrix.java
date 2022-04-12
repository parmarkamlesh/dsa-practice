class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int leng=mat.length;
        int x=0;
        int[] arr=new int[leng];
        int[] result=new int[k];        
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                }else{
                    break;
                }
            }
            arr[i]=c*1000+i;
        }
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            result[i]=arr[i]%1000;
        }
        return result;
    }
}