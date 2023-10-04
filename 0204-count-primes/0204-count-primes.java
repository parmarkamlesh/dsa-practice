class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean arr[]=new boolean[n+1];
        for(int i=0;i<n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==true)
                count++;
        }
        return count;
    }
}