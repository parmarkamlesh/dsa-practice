class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
            return true; 
        else
            return false;    
        
    } 
    public boolean halvesAreAlike(String s) {
        int half=s.length()/2;
        int cnt=0;
        for(int i=0;i<half;i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }
        }
        for(int i=half;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                cnt--;
            }
        }
        return (cnt==0)?true:false;
    }
}