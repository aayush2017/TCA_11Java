abstract class c1 { 
	abstract void print();
	void display() {
		System.out.println("class 2");
	}
} 
class c2 extends c1 { 
	void print() { System.out.println("class 1"); }  
} 
class abstractClass { 
    public static void main(String[] args) {
    	c1 c = new c2();
    	c.display();
    	c.print();
    }
}
