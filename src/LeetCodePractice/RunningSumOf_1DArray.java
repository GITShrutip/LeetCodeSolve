package LeetCodePractice;

public class RunningSumOf_1DArray {

	public static void main(String[] args) {
		/**
		 * Running sum of given array e.g arr = [1,2,4,10] output should be [1,3,7,17]
		 * Time Complexity = O(n) , as we will loop through each array
		 * Space Complexity = O(n), as we wil use same array and will not use memory to create new datastructure
		 */

		int[] arr= {1,4,6,7,8,10};
		arr=runningSum(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static int[] runningSum(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			nums[i]=nums[i-1]+nums[i];
		}
		
		return nums;
	}

}
