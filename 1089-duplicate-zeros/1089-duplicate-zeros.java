class Solution {
    public void duplicateZeros(int[] arr) {
     Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            q.add(arr[i]);

            if(arr[i] == 0)
                q.add(0);

            arr[i] = q.remove();
        }     
    }
}