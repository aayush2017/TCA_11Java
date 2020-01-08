class A {
	public void display() {
		System.out.println("Hello from Class A");
	}
}
class B extends A {
	public void display() {
		System.out.println("Hello from Class B");
	}
}
class overloading {
	public static void main(String[] args)  
    {  
      B b = new B();
      b.display();
      b.display();
    }
}