class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] sArr=s.split(" ");               
        // for(String qs:sArr)
        //     System.out.println("->"+qs+"<-");
        StringBuilder sb=new StringBuilder(s.length()-1);
        for(int i=sArr.length-1;i>-1;i--){
            if(!sArr[i].equals(""))
                sb.append(sArr[i].strip()+" ");            
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}