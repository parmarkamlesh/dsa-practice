class Solution {
    public int titleToNumber(String st) {
        //A 65 B 66 
        int ans=0;
        for(int i=0;i<st.length();i++){
            ans*=26;
            ans+=(int) (st.charAt(i)-'A'+1);
        }
        return ans;
        
     }
}