class Solution {
    public int[] decrypt(int[] code, int k) {
    int[] result = new int[code.length];
        // bruteforce n*n
    int n=result.length;	
        if (k == 0) 
		    return result;
	    
	for (int i = 0; i <n ; i++) {
		if (k > 0) {
			for (int j = i + 1; j < i + k + 1; j++) {
				result[i] += code[j % n];
			}
		} else {
			for (int j = i - 1; j > i + k - 1; j--) {
				result[i] += code[(j + n) % n];
			}
		}
	}
	return result;  
    }
}