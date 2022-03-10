class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars=new int[26];
        for(int i=0;i<magazine.length();i++){
            chars[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int temp=--chars[ransomNote.charAt(i)-'a'];
            if(temp<0)
                return false;
        }
        return true;
        
    }
}