
public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void printArea() {
		System.out.println(length*breadth);
	}
	public void printPerimeter()
	{
		System.out.println(2*(length+breadth));
	}
	
	}

	
class Square extends Rectangle{
	int side;
	public Square(int s) {
		super(s,s);
	}
	
}
class Main{
	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,6);
		Square s=new Square(20);
		s.printArea();
		s.printPerimeter();
		
		Square[] a=new Square[10];
		int k=5;
		for(int i=0;i<10;i++) {
			a[i]=new Square(k);
			k++;
		}
		for(int i=0;i<10;i++) {
			a[i].printArea();
			a[i].printPerimeter();
		}
	}
}
