class Solution {
    public boolean backspaceCompare(String s, String t) {
     int lenS=s.length()-1;   
     int lenT=t.length()-1;
        
     Stack<Character> stk=new Stack();
     Stack<Character> stk2=new Stack();    

    for(int i=0;i<s.length();i++){        
        if(s.charAt(i) != '#'){
            stk.push(s.charAt(i));            
        }
        else if(stk.size()>0 && s.charAt(i) == '#'){
            stk.pop();
        } 
    }

    for(int i=0;i < t.length();i++){        
        if(t.charAt(i) != '#'){
            stk2.push(t.charAt(i));            
        }
        else if(stk2.size() > 0 && t.charAt(i) == '#'){
            stk2.pop();
        }
    }    
        
    if(stk.size() == stk2.size()){
        while(stk.size() != 0){
            if(stk.pop() != stk2.pop()){
                return false;
            }
        }        
        return true;
    }else{
        return false;
    }
    }
}