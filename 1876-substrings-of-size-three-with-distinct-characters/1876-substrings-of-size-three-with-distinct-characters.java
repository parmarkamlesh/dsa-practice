class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        int start=0;
        int end=2;
        int counter=0;
        while(end<s.length()){
            if(
             s.charAt(start)!=s.charAt(end) &&
             s.charAt(start+1)!=s.charAt(end) &&
             s.charAt(start)!=s.charAt(end-1)
            ){
                counter++;
            }
            start++;
            end++;
        }
        return counter;
    }
}