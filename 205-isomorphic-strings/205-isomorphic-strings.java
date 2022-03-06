class Solution {
    public boolean isIsomorphic(String s, String t) {
//TODO
      if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;
                
            }
        }
        return true;
        
        //      HashMap<Character,Integer> m1=new HashMap();   
//      HashMap<Character,Integer> m2=new HashMap();   
//      for(int i=0;i < s.length();i++){
//          if(m1.containsKey(s.charAt(i))){
//              m1.put(s.charAt(i),m1.get(s.charAt(i)) + 1 );             
//          }else{
//              m1.put(s.charAt(i),1);
//          }
//      }
        
//     for(int i=0;i < t.length();i++){
//          if(m2.containsKey(t.charAt(i))){
//              m2.put(t.charAt(i),m2.get(t.charAt(i)) + 1 );             
//          }else{
//              m2.put(t.charAt(i),1);
//          }
//      }
    }
}