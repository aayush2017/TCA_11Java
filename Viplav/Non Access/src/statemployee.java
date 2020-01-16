
public class statemployee {
	 String EmployeeName;
	int empid;
static String compName;
static int counter=0;
public void Employee(String EmployeeName)
{
	this.EmployeeName=EmployeeName;
	this.empid=empid;
	
}
 static int setEmpid() {
	counter++;
	return counter;
}
static void setComp(String name)
{
	compName=name;
}
void getEmpifo() {
	System.out.println("EmployeeName:"+this.EmployeeName);
	System.out.println("empid:"+this.empid);
	System.out.println("compName:"+compName);
}}
  class Main{
	public static void main(String[] args) {
     statemployee.setComp("xcv");
     statemployee s1=new statemployee();
     s1.getEmpifo();
		
	}
}


