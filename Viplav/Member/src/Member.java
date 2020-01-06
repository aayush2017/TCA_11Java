
public class Member {

    void printSalary(int salary) {
    	System.out.println("Print salary:"+salary);
    }
    
}
class Employees extends Member
     {
	void datamembers(String Name,String address,int age,int phoneno)
	{
		System.out.println("Name:"+Name);
		System.out.println("address:"+address);
		System.out.println("Age:"+age);
		System.out.println("phoneno:"+phoneno);
	}

     }
class Manager extends Member{
	
	void Datamembers(String specialization,String department) {
		System.out.println("Specialization:"+specialization);
		System.out.println("Department:"+department);
		
	}


	public static void main(String[] args) {
		Member obj=new Member();
		Employees obj1=new Employees();
		Manager obj2=new Manager();
		obj.printSalary(15000);
		obj1.datamembers("Viplav","Delhi",23,1500);
		obj2.Datamembers("Developer", "Mobile Development");
		
	}
}