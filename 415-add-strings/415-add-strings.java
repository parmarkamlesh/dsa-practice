class Solution {
    public String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        while (lenA >= 0 || lenB >= 0) {
          int firstval = 0;
          int secondval = 0;
          if (lenA >= 0) {
            firstval = a.charAt(lenA) -'0';
            lenA--;
          }
          if (lenB >= 0) {
            secondval = b.charAt(lenB) -'0';
            lenB--;
          }
          int sum = firstval + secondval + carry;
          if (sum>9) {
            sb.append(sum%10);
            carry = sum/10;
          } else {
            sb.append(sum);
            carry = 0;
          }

        }
        if (carry>0) {
          sb.append(carry);
        }
        return sb.reverse().toString();   
    }
}