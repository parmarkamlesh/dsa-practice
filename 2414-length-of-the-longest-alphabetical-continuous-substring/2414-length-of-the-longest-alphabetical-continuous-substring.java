class Solution {
    //emergency todo
    public int longestContinuousSubstring(String s) {
        int j = 0, returnval = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(j) + i - j)
                j = i;
            returnval = Math.max(returnval, i - j + 1);
        }
        return returnval;
    }
}