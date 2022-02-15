class Solution {
    String revStr(String str){
        int start=0;
        int end=str.length()-1;
        char[] temp=str.toCharArray();
        while(start<=end){
            char t=temp[start];
            temp[start]=temp[end];
            temp[end]=t;
            start++;
            end--;
        }
        return new String(temp);
    }
    public String reverseWords(String s) {
        
        StringBuilder sb=new StringBuilder();
        int start=0;
        int subStart=0;
        
        while(subStart<s.length()){

            while(subStart<s.length() && s.charAt(subStart)!=' '){
                subStart++;        
            }
        
            sb.append( revStr(s.substring(start,subStart) )+" ");
            subStart++;
            start=subStart;
        }
        
        return sb.toString().trim();
    }
}