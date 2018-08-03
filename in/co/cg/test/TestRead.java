package in.co.cg.test;

import java.io.*;

import in.co.cg.employee.Employee;

public class TestRead {
	public static void main(String[] args) throws ClassNotFoundException {

		Employee employee1, employee2, employee3; // Employee references

		try (FileInputStream fis = new FileInputStream("emp.txt"); // File read emp.txt
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			employee1 = (Employee) ois.readObject(); // reading Employee objects from file
			employee2 = (Employee) ois.readObject();
			employee3 = (Employee) ois.readObject();

			System.out.println(employee1);// printing Employee details
			System.out.println(employee2);
			System.out.println(employee3);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
