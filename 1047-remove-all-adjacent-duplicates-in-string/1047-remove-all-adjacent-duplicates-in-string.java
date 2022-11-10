class Solution {
    public String removeDuplicates(String s) {
     // Stack<Character> stack1 = new Stack<Character>();
     //    for(int i=0;i<s.length();i++){
     //        if(!stack1.isEmpty()){
     //            if(stack1.peek()==s.charAt(i)){
     //                stack1.pop();
     //                continue;
     //            }
     //        }
     //            stack1.push(s.charAt(i));
     //        }
     //    StringBuilder sb = new StringBuilder();
     //    for(Character ss : stack1) sb.append(ss);
     //    return sb.toString();
        StringBuilder stack = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.setLength(len - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}