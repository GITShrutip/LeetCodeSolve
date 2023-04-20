import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		//Traditional arrays --
		
		int[] a= {2,3,4,5,6,7};
		
		//iterating through array .. avdance for loop
		for(int x: a)
		{
			System.out.println(x);
		}

		String str[]= {"abc","pqr","pune","hyderabad"};
		
		for(String x: str)
		{
			System.out.print(x+" ");
		}
		
		//converting arrays into string list
		
		List<String> nlist=Arrays.asList(str);
		
		nlist.forEach(System.out::println);
		
	
		
		for(String k:nlist) {
			System.out.println(k);
		}
		
		ArrayList arr= new ArrayList<>();
		
		System.out.println("************************");
		arr.add("Abcd");
		arr.add(5);
		arr.add(0, "newAddition at position 0");
		
		
		
		
		arr.forEach(System.out::println);
		
		
	}

}
