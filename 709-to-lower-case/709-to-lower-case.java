class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            int currentAski=(int)s.charAt(i);
            if(65<=currentAski && currentAski<=90){
                sb.setCharAt(i,(char)(currentAski+32) );
            }
        }
        return sb.toString();
    }
}