
public class MyClass2 {
	public static void printRepeating(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
        	int syb = 0;
        	int count = 0;
            for (j = 0; j < size; j++)  
            { 
                if (arr[i] == arr[j]) { 
                	syb = arr[i];
                	count++;
                }
            } 
            System.out.print("\nSybl: " + syb + " = " + count);
        } 
    } 
	public static void main(String[] args)  
    {  
        int arr[] = {4, 2, 4, 5, 2, 3, 5, 1}; 
        int arr_size = arr.length; 
        printRepeating(arr, arr_size); 
    } 
}
