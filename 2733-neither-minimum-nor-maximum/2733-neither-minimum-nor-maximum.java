class Solution {
    public int findNonMinOrMax(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }

        int min = arr[0];
        int max = arr[0];
        int nonMinOrMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                nonMinOrMax = min;
                min = arr[i];
            } else if (arr[i] > max) {
                nonMinOrMax = max;
                max = arr[i];
            } else if (arr[i] != min && arr[i] != max) {
                nonMinOrMax = arr[i];
            }
        }

        return nonMinOrMax;
    }

}