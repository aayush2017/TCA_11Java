import java.util.Scanner;
class Mathed2
{
	public static void main(String []dcvxd)
	{
		int array[]=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The Value");
		for( i=0;i<=5;i++)
		{
			array[i]=obj.nextInt();
		}
		
		//Array2 arr=new Array2();
		student(array[i]);
	}
	public static void student(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]);	
		}
		
	}

}
