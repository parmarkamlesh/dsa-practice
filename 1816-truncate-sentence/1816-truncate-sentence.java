class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                k--;
            if(k == 0) 
                break;
            
            sb.append(s.charAt(i));
        }
        return sb.toString();        
        // String[] ar=s.split(" ");
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<k;i++){
        //     sb.append(ar[i]+" ");
        // }
        // return sb.toString().trim();
    }
}