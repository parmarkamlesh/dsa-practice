class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    int n = num.length;
    int carry = 0;
    List<Integer> res = new ArrayList<>();

    // start from the least significant digit
    for (int i = n - 1; i >= 0; i--) {
        int digit = num[i];
        // add the corresponding digit of k, if any
        if (k > 0) {
            digit += k % 10;
            k /= 10;
        }
        // add the carry from the previous digit, if any
        digit += carry;
        carry = digit / 10;
        digit %= 10;
        // prepend the resulting digit to the answer
        res.add(0, digit);
    }

    // add any remaining digits of k, if any
    while (k > 0) {
        int digit = k % 10 + carry;
        carry = digit / 10;
        digit %= 10;
        res.add(0, digit);
        k /= 10;
    }

    // add the remaining carry, if any
    if (carry > 0) {
        res.add(0, carry);
    }

    return res;        
    }
}