package interfacedemo;

public class FunctionalClass {

	

			public static void main(String[] args) {
			
				//Lambda Expression
				GreetingDemo gd = () -> 
				System.out.println("Hello Everyone, Welcome to the Java Session");
				
				gd.greet();

	}

}
