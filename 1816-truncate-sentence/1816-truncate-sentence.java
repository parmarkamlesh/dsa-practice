class Solution {
    public String truncateSentence(String s, int k) {
        String[] ar=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(ar[i]+" ");
        }
        return sb.toString().trim();
    }
}