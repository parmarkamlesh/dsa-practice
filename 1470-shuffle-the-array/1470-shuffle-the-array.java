class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] oparr=new int[2*n];
        int opc=0;
        int start=0;
        int mid=n;
        while(opc<(2*n)){
            oparr[opc++]=nums[start++];
            oparr[opc++]=nums[mid++];
        }

        return oparr;

//         int[] op=new int[n*2];
//         int start=0;
//         int mid=n;
        
//         int counter=0;
//         for(int i=0;i<n;i++){
//             op[counter]=nums[start];
//             op[counter+1]=nums[mid];
//             counter+=2;
//             start++;
//             mid++;
//         }
//         return op;
        
    }
}