// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        ArrayList<Long> outp=new ArrayList<>();
        long first=1,second=1,i;

        if(n<1)
        return new long[]{};

        outp.add(first);

        for (i = 1; i < n; i++) {
            outp.add(second);
            long next = first + second;
            first = second;
            second = next;
        }

        long[] arr=new long[outp.size()];
        for(int x=0;x<outp.size();x++){
            arr[x]=outp.get(x);
        }
            return arr;
        }
}