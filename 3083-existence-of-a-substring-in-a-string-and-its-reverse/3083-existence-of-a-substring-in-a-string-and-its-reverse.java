class Solution {
    public boolean isSubstringPresent(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
        for(int i=0;i<rev.length()-1;i++){
            if(s.contains(rev.substring(i,i+2)))
                return true;
        }
        return false;  
    }
}