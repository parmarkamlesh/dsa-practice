class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[]=new int[26];
        for(char c : sentence.toCharArray()){
            arr[122-((int)c)]=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=1){
                return false;
            }
        }
        return true;

    }
}