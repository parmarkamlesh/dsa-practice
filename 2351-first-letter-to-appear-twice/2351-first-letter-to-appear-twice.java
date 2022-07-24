class Solution {
    public char repeatedCharacter(String s) {
        int cnt[]= new int[26];
        for(char ch:s.toCharArray()){
            int ind=ch-'a';
            cnt[ind]++;
            if(cnt[ind]==2){
                return ch;                            
            }

        }

        return '0';//default return needed
    }
}