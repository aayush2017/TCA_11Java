class RepeatElement  
{ 
    public static void main(String args[])  
    { 
	int a[]=new int[]{1,2,1,3,1,2,4,6,4,2};
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < a.length; i++)  
        { 

            for (j = i+1; j < a.length; j++)  
            { 
                if (a[i] == a[j])
				{					
			     System.out.println(a[i]);
				}					
            } 
        } 
    } 
  
   
} 