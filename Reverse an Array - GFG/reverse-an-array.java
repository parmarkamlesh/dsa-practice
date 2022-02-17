/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int tc=sc.nextInt();
	    while(tc!=0){
	        
	        int n=sc.nextInt();
	        int[] nums=new int[n];
	        
	        for(int i=0; i<n; i++)
	            nums[i]=sc.nextInt();
            
            int start=0;
            int end=n-1;
            
            while(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
            for(int i=0;i<n;i++){
                System.out.print(nums[i]);
                if(i<n-1)
                System.out.print(" ");
            }
            tc--;
            System.out.println();
	    }
	}
}