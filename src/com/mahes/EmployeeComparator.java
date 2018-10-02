package com.mahes;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getEmpId()>emp2.getEmpId()){
			return -1;
		}else if(emp1.getEmpId()<emp2.getEmpId()){
			return 1;
		}else if(emp1.getEmpId()==emp2.getEmpId()){
			if(emp1.getName().toString().length()<emp1.getName().toString().length()){
				return -1;
			}else{
				return 1;
			}
		}
		
		return 0;
	}

}
