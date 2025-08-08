package abstraction.prgram;

public class Abstract {

	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		
		
		Shape shape;
		shape=new Square(10.2f);
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		shape=new Rectangle(15,20);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
		
		

	}

}
