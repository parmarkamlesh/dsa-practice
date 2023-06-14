class Solution {
    public int findNonMinOrMax(int[] arr) {
        if(arr.length < 3)
            return -1;
        
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min!=arr[i] && max!= arr[i]) {
                return arr[i];
            }
        }
        return -1;
        
    }
}