class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if (c == '(')
                    stack.push(')');
                else if (c == '{')
                    stack.push('}');
                else if (c == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        
            return stack.isEmpty();        

        // Stack<Character> stk=new Stack();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
        //         stk.push(s.charAt(i));
        //     }else{
        //         if(stk.size()==0){
        //             stk.push(s.charAt(i));                    
        //             continue;
        //         }
        //         if(stk.peek()=='(' && s.charAt(i)==')'){
        //             stk.pop();
        //         }else if(stk.peek()=='{' && s.charAt(i)=='}'){
        //             stk.pop();
        //         }else if(stk.peek()=='[' && s.charAt(i)==']'){
        //             stk.pop();                    
        //         }else{
        //             stk.push(s.charAt(i));                    
        //         }
        //     }
        // }
        // return stk.size()==0;
        
    }
}
