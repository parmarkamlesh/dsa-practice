class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int count=0,len=s.length();
        for(int i=0;i<len-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count++;
            }
        }
        return count;
    }
}