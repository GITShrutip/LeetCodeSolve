package LeetCodePractice;

public class CheckPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("\"race a car\""));

	}
	public static boolean isPalindrome(String str) {
		
		StringBuffer sf=new StringBuffer();
		
		char[] c=str.toCharArray();

		  for(int i=0;i<c.length;i++){
				if(Character.isLetterOrDigit(c[i])){
					sf.append(c[i]);
					System.out.print(c[i]);
				}
			}
			
			String x=sf.reverse().toString();
			System.out.println(" "+x);
			x=x.toLowerCase();
			str=str.toLowerCase();
			System.out.println(x);
			System.out.println(sf.reverse().toString());
			if(x.toLowerCase().equals(sf.toString().toLowerCase())) {
				return true;
			}
			else {
				return false;
			}
			
	    }

	
	
}
