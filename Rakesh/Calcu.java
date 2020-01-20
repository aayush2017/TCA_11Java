public class Calcu
{
		double mealcost=12;
		int tippercent=20;
		int taxpercent=8;
		//static double totalcost;
		public void tax()
		{
			//(mealcost*tippercent/100);
			System.out.println((mealcost*tippercent/100));
		}
		
		public void taax()
		{
			System.out.println(12.0*8/10);
		}
		
	public static void main(String []args)
	{
		Calcu c=new Calcu();
		c.tax();
		c.taax();
	}
}