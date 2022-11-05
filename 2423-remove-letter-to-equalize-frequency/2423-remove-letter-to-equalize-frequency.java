class Solution {
    public boolean equalFrequency(String word) {
        int[] data = new int[26];
        for (char c: word.toCharArray()) data[c -'a']++;
        for (int i = 0; i < 26; i++){
            data[i]--;
            if (isEqual(data)) return true;
            data[i]++;
        }
        return false;
    }
    //tttttdo
    private boolean isEqual(int[] data){
        int lastCount = 0;
        for (int count: data){
            if (count == 0) continue;
            if (lastCount != 0 && count != lastCount) return false;
            lastCount = count;
        }
        return true;
    }
}