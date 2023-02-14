class Solution {
public:
    string addBinary(string a, string b) {
int carry = 0, i = a.size() - 1, j = b.size() - 1;
    string result = "";

    while (i >= 0 || j >= 0 || carry) {
        int sum = carry;
        if (i >= 0) sum += a[i--] - '0';
        if (j >= 0) sum += b[j--] - '0';
        result = to_string(sum % 2) + result;
        carry = sum / 2;
    }

    return result;
    }
};