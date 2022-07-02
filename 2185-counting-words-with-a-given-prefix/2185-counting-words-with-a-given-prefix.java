class Solution {
    public int prefixCount(String[] words, String pref) {
     int counter=0;
     String matchw="^("+pref+").*$";
        for(String w : words){
            if(w.matches(matchw)){
                counter++;
            }
        }
    return counter;
    }
}