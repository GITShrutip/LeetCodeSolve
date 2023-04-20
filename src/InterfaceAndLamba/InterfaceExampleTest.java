package InterfaceAndLamba;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class InterfaceExampleTest{

	public static void main(String[] args) {
	
		/**
		 * normal interface implementation :: calling from class who have implemented method
		 */
		InterfaceExample1 a=new InterfaceExample1();
		a.addition(5, 5);
		
		/**
		 *  interface simple implementation here
		 *  normal in code implementation
		 */
		
		InterFaceImplementation im=new InterFaceImplementation() {

			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);
				
			}
			
		};
		
		im.addition(5, 5);
		
		/**
		 * now use lambda expression to implement same :: '->' this is lamda expression
		 */
		
		InterFaceImplementation i=(int x,int y)->{System.out.println(x+y);};
		i.addition(5, 10);
		/**
		 * Binary Operator uses
		 */
		
		BinaryOperator<Integer> bi=( x, y)->{return (x*y);};
		System.out.println(bi.apply(5, 55));
		
		/**
		 * Unary operator
		 */
		
		UnaryOperator<Integer> un=(x)->{return x*5;};
		System.out.println(un.apply(4));
		
		/**
		 * Predicate example :: more examples needed.
		 */
		
		Predicate<Integer> pre=(t)->{ if(t>5) {return true; }
		return false;};
		System.out.println(pre.test(2));
		
		}
		
	}

	



class InterfaceExample1 implements InterFaceImplementation{

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
}

