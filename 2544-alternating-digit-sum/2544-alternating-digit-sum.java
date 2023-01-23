class Solution {
    public int alternateDigitSum(int n) {
        String[] digits = Integer.toString(n).split("");

        int res = 0;
        for (int i = 0; i < digits.length; ++i) {
          res += Integer.parseInt(digits[i]) * (i % 2 == 0 ? 1 : -1);
        }
        return res;
    }
}