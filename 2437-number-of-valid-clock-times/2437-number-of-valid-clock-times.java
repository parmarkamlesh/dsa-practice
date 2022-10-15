class Solution {
    public int countTime(String time) {
        int count = 1;
        String first = time.substring(0, 2);
        String second = time.substring(3);
        
        // hours:
        // 1. 00 - 23

        for (int i = 0; i < first.length(); i++) {

            if (i == 0 && first.charAt(i) == '?') {
                if (first.charAt(i + 1) == '?') {
                    count *= 24;
                    break;
                }
                if (first.charAt(i + 1) - '0' <= 3) {
                    // i.e: 3: 03 13 23

                    count *= 3;

                } else if (first.charAt(i + 1) - '0' >= 4) {
                    // i.e: 5: 05 15

                    count *= 2;

                }
            }
            if (i == 1 && first.charAt(i) == '?') {

                if (first.charAt(i - 1) - '0'< 2) {
                    count *= 10;
                } else if (first.charAt(i - 1) - '0' == 2) {
                    count *= 4;
                }
            }
        }
        // minutes:
        for (int i = 0; i < second.length(); i++) {

            if (i == 0 && second.charAt(i) == '?') {
                count *= 6;
            } 
            if (i == 1 && second.charAt(i) == '?') {

                count *= 10;
            }
        }
        return count;
        
    }
}