import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int n) {
        int counter=0;
        for(int i=0;i<64;i++){
            if( (n&1)==1 ){
                counter++;
            }
            n=n>>1;
        }
        return counter;
    }
}
