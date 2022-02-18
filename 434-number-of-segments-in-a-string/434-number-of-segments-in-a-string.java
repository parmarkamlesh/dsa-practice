class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
            return 0;
        int counter=0;
        for(String x:s.split(" ")){
            if(x.length()>0){
                counter++;
            }
        }
        return counter;
    }
}