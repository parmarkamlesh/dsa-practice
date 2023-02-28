class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        while(n>0){
            n--;
            char ad=(char)( (n%26) +65);
            sb.insert(0,ad);
            n/=26;
            
        }
        return sb.toString();
    }
}