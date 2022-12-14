class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int sInd=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(sInd)==t.charAt(i)){
                sInd++;
                if(sInd==s.length())
                    return true;
            } 
        }
        return false;
    }
}