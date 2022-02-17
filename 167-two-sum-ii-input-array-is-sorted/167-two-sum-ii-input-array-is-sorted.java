class Solution {
     public int[] twoSum(int[] numbers, int target) {
        int find, index;
        int result[]=new int[2];
        for(int i=0; i<numbers.length; i++)
        {
            find = target - numbers[i];
            index = search(i+1, numbers.length-1, numbers, find);
            if(index!=-1)
            {
                result[0] = i+1;
                result[1] = index+1;
            }
        }
        return result;
    }
    public int search(int start, int end, int arr[], int target)
    {
        while(start<=end)
        {
            int middle = (start+end)/2;
            if(arr[middle]==target)
                return middle;
            else if(arr[middle]>target)
                end = middle-1;
            else
                start = middle+1;
        }
        return -1;
    }
    // public int[] twoSum(int[] numbers, int target) {
    //     int start=0;
    //     int end=numbers.length-1;
    //     while(start<=end){
    //         if(numbers[start]+numbers[end]==target){
    //             return new int[]{start+1,end+1};
    //         }
    //         if(numbers[start]+numbers[end]>target){
    //             end--;
    //         }else{
    //             start++;
    //         }
    //     }
    //     return new int[]{};
    // }
}