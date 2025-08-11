package wrapperclassdemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int x = 5;
		//autoboxing
		Integer y = Integer.valueOf(x);
		
		//unboxing 
		
		int z = y;
		
		System.out.println(y +" "+ z);


	}

}
