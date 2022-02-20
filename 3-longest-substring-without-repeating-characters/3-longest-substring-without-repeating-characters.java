class Solution {
    public int lengthOfLongestSubstring(String s) {
        //intial window TODO
        HashSet<Character> hashSet = new HashSet();
        int max = 0;
        int slowi = 0;
      
        for (int i = 0; i < s.length();) {
            
            if (!hashSet.contains(s.charAt(i))) {
                hashSet.add(s.charAt(i));        
                max = Math.max(max, hashSet.size());
                i++;
            } else {
                hashSet.remove(s.charAt(slowi++));
            }
        }
        return max;      
    }
}