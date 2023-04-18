class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0,j=0;(i<word1.length() || j<word2.length());i++,j++){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(j<word2.length()){
                sb.append(word2.charAt(j));
            }
        }
        return sb.toString();
    }
}