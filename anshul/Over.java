class Parent { 
    
    private  void m1() 
    { 
        System.out.println("From parent m1()"); 
    } 
  
    public void m2() 
    { 
        System.out.println("From parent m2()"); 
    } 
} 
  
class Child extends Parent { 
     
    private void m1() 
    { 
        System.out.println("From child m1()"); 
    } 
   
    private void m2() 
    { 
        System.out.println("From child m2()"); 
    } 
} 
public class Over {
	public static void main(String[] args) 
    { 
        Parent obj1 = new Parent(); 
        obj1.m2(); 
        Parent obj2 = new Child(); 
        obj2.m2(); 
    } 
} 


