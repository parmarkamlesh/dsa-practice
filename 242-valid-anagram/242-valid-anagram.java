class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charr=new int[26];
        for(int i=0;i<s.length();i++){
            charr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            charr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<charr.length;i++){
            if(charr[i]!=0)
                return false;
        }
        return true;
    }
}
