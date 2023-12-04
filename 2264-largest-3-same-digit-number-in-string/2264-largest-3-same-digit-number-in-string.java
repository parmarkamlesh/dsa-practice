class Solution {
    public String largestGoodInteger(String num) {
        if(num.length()<3){
            return "";
        }
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+2)==num.charAt(i+1)){
                if(Integer.parseInt(""+num.charAt(i))>=max){
                    max =Integer.parseInt(""+num.charAt(i));
                }
            }
        }
        return (max==-1)?"":""+max+max+max;
    }
}