
public class Inherit {
	void parentclass()
	{
		System.out.println("this is parent class");
	}
}

class child extends Inherit{
	void childclass()
	{
		System.out.println("this is child class");
	}
}
class Main{
	public static void main(String[] args) {
		Inherit obj=new Inherit();
		child obj1=new child();
		obj.parentclass();
		obj1.childclass();
	
	
		
	}
}
