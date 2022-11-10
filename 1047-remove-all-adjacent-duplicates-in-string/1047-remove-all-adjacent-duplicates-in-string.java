class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> stack1 = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(!stack1.isEmpty()){
                if(stack1.peek()==s.charAt(i)){
                    stack1.pop();
                    continue;
                }
            }
                stack1.push(s.charAt(i));
            }
        StringBuilder sb = new StringBuilder();
        for(Character ss : stack1) sb.append(ss);
        return sb.toString();
    }
}