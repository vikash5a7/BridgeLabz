package ds;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(value= {
		"name",
		"emp",	
		
})
public class Employee implements Serializable {
	private int emp;
	private String name;
	@JsonIgnore
	private double salary;


	public Employee() {
		
	}

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
