class Solution {
    HashMap<String,Character> starter=new HashMap<>();
    public Solution(){
        for(int x=1;x<=26;x++){
            starter.put(""+x,(char)(x+96));
        }
    }
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                sb.append(starter.get(""+s.charAt(i)+s.charAt(i+1)));
                i+=2;
                continue;
            }
                sb.append(starter.get(""+s.charAt(i)));            
        }
        return sb.toString();
    }
}