class Solution {
    //todo
    public int subsetXORSum(int[] A) {
        return back(A, 0, 0);    
    }
    
    int back(int[] A, int i, int cur) {
        if (i == A.length)
            return cur;
        return back(A, i+1, cur^A[i]) + back(A, i+1, cur);
     
    }
}