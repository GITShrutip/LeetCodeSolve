
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,5,7,9};
		int b[]={2,4,6,8};
		
		//output should be c[]={1,2,3,4,5,6,7,8,9}
		
		//1. to combine
		
		int c[]=new int[a.length+b.length];
		int count=0;
		
		
		for(int i=0;i< a.length; i++) {
			
			c[count]=a[i];
			count++;
		}
		for(int i=0;i< b.length; i++) {
			
			c[count]=b[i];
			count++;
		}
		
		for(int x:c) {System.out.print(x+"");}
		System.out.println("");
		//2. sort array
		for(int j=0; j<c.length-1;j++) {
		for(int i=0; i<c.length-1;i++) {
			
			if(c[i]>c[i+1]) {
				count=c[i];
				c[i]=c[i+1];
				c[i+1]=count;
			}
		}
		}
		for(int x:c) {System.out.print(x+"");}
		

	}

}
