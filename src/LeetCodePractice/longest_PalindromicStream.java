package LeetCodePractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class longest_PalindromicStream {

	public static void main(String[] args) {
		
		System.out.println(longestPalindromeSubseq("aa"));

	}
	
	
	    public static int  longestPalindromeSubseq(String s) {

 	    	char[] c=s.toCharArray();
	    	Map<Character,Integer> map=new HashMap<Character,Integer>();
	    	int count=0;
	    	int totalSum=0;

				StringBuffer sf=new StringBuffer(s);
				if(s.equals(sf.reverse().toString())){
					return s.length();
				}
	    	
	    	for(int i=0;i<s.length();i++) {
	    		count=0;
	    		for(int j=0;j<s.length();j++) {
	    			
	    			if(s.charAt(i)==c[j]) {
	    				count++;
	    			}
	    		}
	    		
	    		if(!map.containsKey(s.charAt(i))) {
	    			System.out.println("Adding to map "+s.charAt(i)+count);
	    			map.put(s.charAt(i), count);
	    		}
	    		
	    	}
	    	
	    	
	    	
	    	int x=0;
	    	Iterator it=map.entrySet().iterator();
	    	
	    	while(it.hasNext()) {
	    		
	    		Map.Entry m=(Map.Entry)it.next();
	    		
	    		x=(int)m.getValue();
	    		System.out.println(x);
	    		//totalSum = totalSum + x;
	    		if(x%2==0) {
					totalSum = totalSum + x;
					}
					else if((x%2)-1>0)
				{
						totalSum = totalSum + x-1;
				}
				// else if(map.size()==2 && x==1){
				// 		totalSum = totalSum + x;
				// }
				else if(map.size()==1){
					return x;
				}
			
				
	    	}
	    	if(totalSum>1){
						return totalSum;

				}else
				{
					return 1;
				}
	    
	        
	    }
        
	   /*
	    * Solution found in leetcode
	     StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();
        return longestCommonSubsequence(s,input1.toString());
    }
     public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int [][] dp = new int[m + 1][n + 1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
	    
	    */
	

}
