package day1.basics;

public class Switch {

	public static void main(String[] args) {
		char x='a';
		switch(x)
		{
		case 'a':
		case'A':
			System.out.println(x+" is a Apple");
			break;
		case 'd':
		case'D':
			System.out.println(x+"is a Digit");
			break;
		case 'y':
		case 'Y':
			System.out.println(x+ "is a Yogurt ");
			break;
		case 'u':
		case 'U':
			System.out.println(x+" is a Umbrella");
			break;
		case 'v':
		case 'V':
			System.out.println(x+"is a Van");
			break;
			default:
				System.out.println(x+"is other than apple,digit,yogurt, umbrella or van");
				break;
		}

	}

}
