class test {
	public static void main(String args[])	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=2;
		a[3]=4;
		a[4]=6;
		System.out.println(a.length);
		for(int i=a.length-1;i>=0;i--)	{
			System.out.println(a[i]);
		}
	}
}