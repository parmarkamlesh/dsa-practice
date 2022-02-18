class Solution {
    public String sortSentence(String s) {
        HashMap<Integer,String> map=new HashMap();
        StringBuilder sb=new StringBuilder();
        
        String[] splitarr=s.split(" ");
        for(String st:splitarr){
            map.put(
                st.charAt(st.length()-1)-'0',//last digit
                st.substring(0,st.length()-1) //string excluding last digit
                );
        }
        for(int i=1;i<10;i++){
            if(map.containsKey(i)){
                sb.append(map.get(i)+" ");
            }
        }
        // System.out.println(Arrays.asList(map));
        return sb.toString().trim();
    }
}