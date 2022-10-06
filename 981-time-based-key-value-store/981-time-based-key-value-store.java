class TimeMap {
    HashMap<String,HashMap<Integer,String>> keymap;
    
    public TimeMap() {
        keymap=new HashMap<String,HashMap<Integer,String>>();    
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keymap.containsKey(key)){
            keymap.put(key,new HashMap<Integer,String>());
        }        
        keymap.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!keymap.containsKey(key)){
            return "";
        }
        for(int timec=timestamp;timec>=1;timec--){
            if(keymap.get(key).containsKey(timec)){
                return keymap.get(key).get(timec);
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */