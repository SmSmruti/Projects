
public class Employee {
 public int empId;
 public String empName;
 public int empSalary;

 public Employee(int id, String name, int salary) {
	empId=id;
	empName=name;
	empSalary=salary;
 }
 public String toString(){
	return "empId ="+empId+", empName ="+empName+", salary ="+ empSalary;
	
}
	public static void main(String[] args) {
		
 Employee emp1=new Employee(2341,"arjun",53000);
       System.out.println(emp1);
	}

}
