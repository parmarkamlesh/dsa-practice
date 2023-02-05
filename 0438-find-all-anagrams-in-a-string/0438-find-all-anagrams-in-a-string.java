class Solution {
    public List<Integer> findAnagrams(String s1, String s2) {       
        //s1=s s2=p
        // s1 = "cbaebabacd", s2 = "abc"
        List<Integer> op=new ArrayList();

        if (s2.length() > s1.length()) {
            return op;
        }
        
        int[] one = new int[26];
        int[] two = new int[26];
        
        for (int i = 0; i < s2.length(); i++) {
            one[s2.charAt(i) - 'a']++;
            two[s1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            if (i != 0) {
                two[s1.charAt(i - 1) - 'a']--;
                two[s1.charAt(i + s2.length() - 1) - 'a']++;
            }

            boolean flag=true;
            for (int k = 0; k < one.length; k++) {
                    if (one[k] != two[k]) {
                        flag=false;
                    }
                }
            if(flag){
                op.add(i);
            }
        }
        return op;        
    }
}