// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
      Map<String,Integer> map = new HashMap<>();
            map.put("I",1);
            map.put("V",5);
            map.put("X",10);
            map.put("L",50);
            map.put("C",100);
            map.put("D",500);
            map.put("M",1000);
            map.put("IV",4);
            map.put("IX",9);
            map.put("XL",40);
            map.put("XC",90);
            map.put("CD",400);
            map.put("CM",900);
        
        int counter=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            String chr=""+s.charAt(i);
            if(i<len-1 && (chr.equals("I") || chr.equals("X") ||chr.equals("C"))){
                //get 2 char from map
                int val=map.getOrDefault(chr+s.charAt(i+1),0);
                if(val==0){
                    //not found
                    counter+=map.get(chr);
                }else{
                    counter+=val;
                    i++; //because we used next char too
                }
                
            }else{
                counter+=map.get(chr);
            }
        }
        return counter;
    }
}