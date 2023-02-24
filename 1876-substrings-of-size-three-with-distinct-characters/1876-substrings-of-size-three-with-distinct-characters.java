class Solution {
    public int countGoodSubstrings(String s) {
        /*
              int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i-2) != s.charAt(i-1) && s.charAt(i-1) != s.charAt(i) && s.charAt(i-2) != s.charAt(i)) {
            count++;
        }
    }
    return count;
    */
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
