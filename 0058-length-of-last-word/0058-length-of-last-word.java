class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] ar=s.split(" ");
        return ar[ar.length-1].length();
    }
}