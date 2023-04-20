package LeetCodePractice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(15,22);
	}

	public static void swap(int a,int b){
		
		System.out.println("Before Swap a="+a+" B="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap a="+a+" B="+b);
		
	}
	
	
	
}
