class MyHashMap {
    //i know its wrong but for now its oke
    private HashMap<Integer,Integer> mp;//=new HashMap<Integer,Integer>();
    public MyHashMap() {
        mp=new HashMap<Integer,Integer>();
    }
    
    public void put(int key, int value) {
        // if(mp.containsKey(key)){
        //     this.mp.put()
        // }
        this.mp.put(key,value);
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            return mp.get(key);
        }else{
            return -1;
        }
    }
    
    public void remove(int key) {
        mp.remove(key);        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */