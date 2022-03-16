class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stk=new Stack<Integer>();
        int p=0,po=0;
        while(p<pushed.length){
            stk.push(pushed[p]);
            p++;            
            while(!stk.empty() && stk.peek()==popped[po]){
                po++;
                stk.pop();
            }

        }
        return stk.empty();
    }
}