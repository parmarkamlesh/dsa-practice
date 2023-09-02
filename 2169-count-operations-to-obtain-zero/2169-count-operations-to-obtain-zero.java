class Solution {
    public int countOperations(int num1, int num2) {/
        // return a * b == 0 ? 0 : a / b + countOperations(b, a % b);
        int counter=0;
        if(num1==0 || num2==0){
            return 0;
        }
        while(true){        
            if(num1>=num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
            counter++;
            if(num1==0 || num2==0){
                break;
            }
        }
        return counter;
    }
}
