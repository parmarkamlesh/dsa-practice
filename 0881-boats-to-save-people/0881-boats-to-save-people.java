class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int count=0;
        int start=0,end=people.length-1;
        
        while(start<=end){
            count++;
            if(people[start]+people[end]<=limit)
                start++;
            end--;
        }
        
        return count;
        
    }
}