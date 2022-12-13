class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ar=s.trim().split(" ");
        if(pattern.length()!=ar.length){
            return false;
        }
        HashMap<String,String> map=new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if(map.containsKey(""+pattern.charAt(i))){
                if(map.get(""+pattern.charAt(i)).equals(ar[i])){
                }else{
                    return false;
                }
            }else{
                if(map.containsValue(ar[i]))
                    return false;
                map.put(""+pattern.charAt(i),ar[i]);
            }
        }       
        return true;
    }
}