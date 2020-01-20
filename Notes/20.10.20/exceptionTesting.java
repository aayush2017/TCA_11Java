public class exceptionTesting {
	public static void main(String[] args) {
		try {
		System.out.println(100);
		System.out.println(200);
	
		try {
			System.out.println(10.120/0.0);
		} catch(ArithmeticException e) {
			System.out.println("Can't devide by Zero");
		}
		
		try {
			String a=null;
			System.out.println(a.length());
		} catch(NullPointerException e)  {  
			System.out.println("Lenght Zero");  
		}
		
		System.out.println(400);
		System.out.println(500);
		System.out.println(600);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
