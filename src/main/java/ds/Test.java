package ds;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmp(12);
		emp.setName("vikash");
		emp.setSalary(122223);
		String jsonData = JsonUtil.convertJavaToJson(emp);
		System.out.println(jsonData);
		System.out.println("------------------------------");
//		Employee emp1 = JsonUtil.convertJsonIntoJava(jsonData, Employee.class);
//		System.out.println("employe id: "+ emp1.getEmp());
//		System.out.println("Employe name is : "+ emp1.getName());
//		System.out.println("employe Salary: : "+ emp1.getSalary());
		
	}

}
