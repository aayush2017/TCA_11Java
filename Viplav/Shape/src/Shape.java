
public class Shape {
	void shape() {
		System.out.println("this is shape");
	}

}
class Rectangle extends Shape{
	void rectangle() {
		System.out.println("this is rectangular shape");
	}
	
}
class Circle extends Shape{
	void circle() {
		System.out.println("this is circular shape");
	}
}
class Square extends Rectangle{
	void square() {
		System.out.println("Square is rectangle");
	}
}
class Main {
public static void main(String[] args) {
	Square s=new Square();
	s.rectangle();
	s.shape();
	s.square();
}
	
}