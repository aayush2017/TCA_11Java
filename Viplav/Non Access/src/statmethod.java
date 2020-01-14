
public class statmethod {
	static int a=20;
	static int b=30;
	static void v1() {
		a=25;
		System.out.println("from v1");
		b=10;
		v2();
		//System.out.println(super.a);
	}
	static void v2() {
		System.out.println("from v2");
	}
	public static void main(String[] args) {
		v1();
		//v2();
	}

}
