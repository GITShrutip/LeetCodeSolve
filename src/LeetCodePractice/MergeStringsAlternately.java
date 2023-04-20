package LeetCodePractice;

import java.util.Stack;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mergeAlternately("abcddd", "pqr"));
	}
	public static String mergeAlternately(String word1, String word2) {
        char s[]=word1.toCharArray();
        char c[]=word2.toCharArray();
        Stack<Character> st=new Stack<Character>();
        int count=0;
        int c_count=0;
        
        for(int i=0;i<word1.length()+word2.length();i++){
            
        
        	if(count<word1.length())
        	{
        		st.push(s[count]);
        		System.out.println(count);
        	}
        	if(c_count<word2.length())
        	{
        		st.push(c[c_count]);
        		System.out.println(c_count);
        	}
            
            
            count++;
            c_count++;

        }

        StringBuffer sf=new StringBuffer();
        while(!st.empty()) {
        	sf.append(st.pop());
        }
        return new String(sf.reverse().toString());


    }

}
