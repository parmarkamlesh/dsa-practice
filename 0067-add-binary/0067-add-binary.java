class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();

    int carry = 0;
    int lenA = a.length() - 1;
    int lenB = b.length() - 1;

    while (lenA >= 0 || lenB >= 0) {

      int bit1 = 0;
      int bit2 = 0;

      if (lenA >= 0) {
        bit1 = a.charAt(lenA) & 1;
        lenA--;
      }
      if (lenB >= 0) {
        bit2 = b.charAt(lenB) & 1;
        lenB--;
      }

      int sum = bit1 + bit2 + carry;

      if (sum == 3) {
        sb.append('1');
        carry = 1;
      } else if (sum == 2) {
        sb.append('0');
        carry = 1;
      } else {
        sb.append("" + sum);
        carry = 0;
      }

    }

    if (carry == 1) {
      sb.append('1');
    }

    return sb.reverse().toString();
  }
}