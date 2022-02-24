class Solution {
    public int firstUniqChar(String s) {
     
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;

    // Map<Character,Integer> map=new LinkedHashMap<>();
     //    for(int i=0;i<s.length();i++){
     //        if(map.containsKey(s.charAt(i))){
     //            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
     //        }else{
     //            map.put(s.charAt(i),1);
     //        }
     //    }
     //    // System.out.println(Arrays.asList(map));
     //    for (Map.Entry<Character,Integer> entry : map.entrySet()){
     //        if(entry.getValue()==1){
     //            return s.indexOf(entry.getKey());
     //        }
     //    }
     //    return -1;
    }
}