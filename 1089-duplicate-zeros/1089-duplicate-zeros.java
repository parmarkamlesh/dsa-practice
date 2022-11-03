class Solution {
    public void duplicateZeros(int[] arr) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZero++;
        }
        int len = arr.length + countZero;
        //todo 
        for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
            if (arr[i] != 0) {
                if (j < arr.length) arr[j] = arr[i];
            } else {
                if (j < arr.length) arr[j] = arr[i];
                j--;
                if (j < arr.length) arr[j] = arr[i]; 
            }
        }
        //      Queue<Integer> q = new LinkedList<>();

//         for(int i=0; i<arr.length; i++){
//             q.add(arr[i]);

//             if(arr[i] == 0)
//                 q.add(0);

//             arr[i] = q.remove();
//         }     
    }
}