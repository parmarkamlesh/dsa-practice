class Solution {
    public boolean areNumbersAscending(String s) {
        String[] temp=s.split(" ");
        int min=0;
        for(String x:temp){
            try {
                Integer nm=Integer.valueOf(x);
                if(min<nm){
                    min=nm;
                }else{
                    return false;
                }

            }
            catch (NumberFormatException e) {
            }

            // if(nm!=null){
            //     }
        }
        return true;
    }
}