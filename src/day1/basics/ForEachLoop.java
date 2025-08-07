package day1.basics;

public class ForEachLoop {

	public static void main(String[] args) {
		//for integer
		int a[]= {10,15,20,25,30};
		for(int i:a)
		{
			System.out.println(i);
		}
		//for character
		char ch[]= {'c','o','r','e'};
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println(" ");
		//for string
		String s1[]= {"java","program","language"};
		for(String s:s1)
		{
			System.out.println(s+"");
		}
		
		

	}

}
