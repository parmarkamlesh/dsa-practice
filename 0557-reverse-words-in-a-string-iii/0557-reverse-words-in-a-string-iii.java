class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int lastInd=-1;
        
        for(int x=0;x<s.length();x++){
       
            if(s.charAt(x)==' ' || x==s.length()-1){
            
                int revInd=(x==s.length()-1)?x:x-1;
                
                for(;revInd>lastInd;revInd--){
                    sb.append(s.charAt(revInd));
                }
                
                if(x!=s.length()-1)
                    sb.append(' ');
                lastInd=x;
            }

        }
        return sb.toString();
    }
}