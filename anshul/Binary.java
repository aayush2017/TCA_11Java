import java.util.Scanner;
public class Binary {
public static void main(String[] args) 
{
	int []a={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	int item;
	int li=0;
	int hi=a.length-1;
	int mi=(li+hi)/2;
	System.out.println(hi);
	System.out.println(mi);
	System.out.println("Enter the number");
	Scanner obj=new Scanner(System.in);
	item=obj.nextInt();
	while(li<=hi)
	{
	for(int i=0;i<a.length;i++)
	{
		if(a[mi]==item)
		{
			System.out.println("the number is found"+mi);
			break;
		}
		else if(a[mi]<item)
		{
			li=mi+1;
		
		
		}
		else
		{
			hi=mi-1;
			
		}
	}
	
	}
	if(li>hi)
	{
		System.out.println("element not found");
	}
}
}
