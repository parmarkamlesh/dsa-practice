class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(hmap.containsKey(s.charAt(i))){
                // hmap.put(s.charAt(i),(i+1)-hmap.get(s.charAt(i))-1);
                if(distance[s.charAt(i)-97]!=i-hmap.get(s.charAt(i))){
                    return false;
                }
            }else{
                hmap.put(s.charAt(i),i+1);
            }
        }
    // for (Map.Entry<Character,Integer> entry : hmap.entrySet()) 
    //         if(distance[entry.getKey()-97]!=entry.getValue()){
    //             return false;
    //         }
        return true;
    }
}