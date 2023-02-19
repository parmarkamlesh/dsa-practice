class Solution {
    public int minMaxDifference(int num) {

        String numStr = Integer.toString(num);
        int maxNum = num;
        int minNum = num;

        for (int i = 0; i < 10; i++) {
            char digit = (char) (i + '0');

            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    continue;
                }

                char replaceDigit = (char) (j + '0');

                String newNumStr = numStr.replace(digit, replaceDigit);

                int newNum = Integer.parseInt(newNumStr);

                if (newNum > maxNum) {
                    maxNum = newNum;
                }
                if (newNum < minNum) {
                    minNum = newNum;
                }
            }
        }

        return maxNum - minNum; 
    }
}