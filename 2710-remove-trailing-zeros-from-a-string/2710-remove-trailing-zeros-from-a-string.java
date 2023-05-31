class Solution {
    public String removeTrailingZeros(String num) {
        int substr=num.length();
        for(int i=num.length()-1;i>0;i--){
            if(num.charAt(i)=='0'){
                substr--;
            }else
                break;
        }
        return num.substring(0, substr);
    }
}