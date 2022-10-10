class Solution {
    public String breakPalindrome(String palindrome) {
        char[] carr = palindrome.toCharArray();
        int n = palindrome.length();

        for (int i = 0; i < n / 2; i++) {
            if (carr[i] != 'a') {
                carr[i] = 'a';
                return String.valueOf(carr);
            }
        }
        carr[n - 1] = 'b';
        return n < 2 ? "" : String.valueOf(carr); 
    }
}