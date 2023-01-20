class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        int counter=0;
        for(String i:s){
        if(i.length()>=searchWord.length()){
            int flag=0;
            for (int j = 0; j < searchWord.length(); j++) {
                if(searchWord.charAt(j)!=i.charAt(j))
                {flag=1;break;}
            }
            if(flag==0){
                return counter+1;
            }
        }
        counter++;

        }
        return -1;
    }
}