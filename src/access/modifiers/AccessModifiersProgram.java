package access.modifiers;

public class AccessModifiersProgram {

	
		public int publicVar = 15;
		private int privateVar = 20;
		protected int protectedVar = 25;
		int defaultVar = 30;
		
		
		public void show() {
			System.out.println("Public Variable: "+ publicVar);
			System.out.println("Private Variable: "+ privateVar);
			System.out.println("Protected Variable: "+ protectedVar);
			System.out.println("Default Variable: "+ defaultVar);
		}

		public static void main(String[] args) {
			
			AccessModifiersProgram amp = new AccessModifiersProgram();
			amp.show();
			

		}

	


	}


