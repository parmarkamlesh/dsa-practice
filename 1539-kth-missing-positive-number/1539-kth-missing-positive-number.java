class Solution {
    public int findKthPositive(int[] arr, int k) {
        //TODO
        int left = 0, right = arr.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] - 1 - mid < k)
                left = mid + 1;
            else
                right = mid;
        }
        return left + k;
    }
}