
class Solution {
    public int strStr(String haystack, String needle) {
        // Not optimal solution
        int nlen=needle.length()-1;
        int hylen=haystack.length();
        
        if(needle.equals("")){
            return 0;
        }
        
        if(needle.length()>haystack.length()){
            return -1;
        }

        for(int i=0;i<haystack.length();i++){
           
            if(haystack.charAt(i)==needle.charAt(0)){
                if(!
                   (
                       (i+nlen)<hylen && needle.charAt(needle.length()-1) ==haystack.charAt(i+nlen)
                       )
                  ){
                   continue; 
                }
                
                int returnind=i;
                int foundCounter=0;

                for(int j=0;j<needle.length() && (i+j)<haystack.length();j++){

                    if(needle.charAt(j)!=haystack.charAt(i+j)){
                        break;                        
                    }else{
                        foundCounter++;                        
                    }

                }
        
                if(foundCounter==needle.length())
                    return returnind;

            }
            
        }
        return -1;
    }
}
