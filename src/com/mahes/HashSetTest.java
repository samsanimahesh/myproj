package com.mahes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		Set<Employee> employeeSet = new TreeSet<Employee>(new EmployeeComparator());
		for(int i=1;i<=4;i++){
			Employee emp = new Employee();
			emp.setEmpId(i);
			emp.setName("emp"+i);
			employeeSet.add(emp);
		}
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setName("maheshhe");
		employeeSet.add(emp);
		Iterator<Employee> iter = employeeSet.iterator();
		while(iter.hasNext()){
			Employee e = (Employee)iter.next();
			System.out.println(e.getEmpId());
			System.out.println(e.getName());
		}
	}

}
