//Class to write in a file 
package in.co.cg.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import in.co.cg.employee.Employee;

public class TestWrite {

	public static void main(String[] args) {

		Employee employee1 = new Employee(201, "Rohit", 19000000);// instantiating class
		Employee employee2 = new Employee(202, "Naik", 1600000);
		Employee employee3 = new Employee(203, "Verma", 500000);

		try (FileOutputStream fos = new FileOutputStream("emp.txt"); // File path for FileOutputStream
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {// passing FileOutputStream object to
																		// ObjectOutputStream

			// Writing objects in Object stream
			oos.writeObject(employee1);
			oos.writeObject(employee2);
			oos.writeObject(employee3);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
