class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int count = 0;
        // description is not proper
        for (int i = len - 2; i >= 0; i--) {
            if (bits[i] == 1) count++;
            else break;
        }
        return count%2 == 0;    
    }
}