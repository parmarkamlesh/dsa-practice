class Solution {
public:
    string addBinary(string a, string b) {
    int carry = 0, i = a.size() - 1, j = b.size() - 1;
    string result = "";

    while (i >= 0 || j >= 0 || carry) {
        int sum = carry;
        if (i >= 0) sum += a[i--] - '0';
        if (j >= 0) sum += b[j--] - '0';
        result += (sum & 1) + '0';
        carry = sum >> 1;
    }

    reverse(result.begin(), result.end());
    return result;
    }
};