class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>1){
            boolean found=false;
            for(int i=0;i<sb.length()-1;i++){
                if(Math.abs(sb.charAt(i)-sb.charAt(i+1))==32){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    found=true;
                    break;
                }
            }
            if(!found)
                break;
        }
        return sb.toString();
    }
}