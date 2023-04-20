package LeetCodePractice;

public class CheckPalindromeNumber {
	/**
	 *  int givenNum=x;
        int val=0;
        while(x!=0){

            // val=x%10;
            
           val=val*10+x%10;
          
            x=x/10;


        }

        if(val==givenNum){
            return true;
        }
        else{
            return false;
        }

	 * @param args
	 */

	public static void main(String[] args) {
		
		int num=121;
		System.out.println(isPalindrome(num));

	}
	
	public static boolean isPalindrome(int x) {
		int givenNum=x;
		
		int val=0;
		
		if(x <0) {
			return false;
		}
		
		
		 if(val==givenNum){
	            return true;
	        }
	        else{
	            return false;
	        }
		
	}

}

