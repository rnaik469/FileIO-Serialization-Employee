
package in.co.cg.employee;

import java.io.Serializable;

//This class implements serialization and de-serialization 
public class Employee implements Serializable {
	private int id;
	private String name;
	private long salary;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
