
public class StatVariable {
static int a=r2();
static {
	System.out.println("inside the block");
}
static int r2() {
	System.out.println("from r2");
	return 45;
	
}
public static void main(String[] args) {
	System.out.println("Value of a:"+a);
}
}
