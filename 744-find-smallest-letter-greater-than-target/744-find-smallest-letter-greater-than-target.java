class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // if(target=='z')
        //     return 'a';
        // int start=0;
        // int end=letters.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(letters[mid]==target && mid+1 <= letters.length-1 ){
        //         return letters[mid+1];
        //     }
        //     if(letters[mid]<target){
        //         start=mid+1;
        //     }else{
        //         end=mid-1;
        //     }
        // }
        // if(start>letters.length-1 || letters[start]==target){
        //     return letters[0];
        // }
        // return letters[start];
        for (char c: letters)
                    if (c > target) return c;
                return letters[0];    }
}