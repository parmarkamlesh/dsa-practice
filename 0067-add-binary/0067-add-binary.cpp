class Solution {
public:
    string addBinary(string a, string b) {
        string result = "";   // initialize the result string as empty
        int carry = 0;        // initialize carry as 0
        int i = a.size() - 1, j = b.size() - 1;   // start from the least significant bit

        while (i >= 0 || j >= 0 || carry) {
            int sum = carry;
            if (i >= 0) {
                sum += a[i] - '0';
                i--;
            }
            if (j >= 0) {
                sum += b[j] - '0';
                j--;
            }
            result = to_string(sum % 2) + result;
            carry = sum / 2;
        }

        return result;

    }
};