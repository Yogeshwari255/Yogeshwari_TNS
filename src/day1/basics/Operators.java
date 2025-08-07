package day1.basics;

public class Operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		 int x = 20;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a;
		int c = ++a + b + a--;
		System.out.println("c value after the operations: " + c);

		int d = c++ + a + b--;
System.out.println("d value after the operations: " + d);

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
	
		  x = (20 == x) ? 1 : 0;	
		  System.out.println(x);

	}

}
