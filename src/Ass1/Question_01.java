package Ass1;

import java.util.List;

public class Question_01 {

	// How many male and female employees are there in the organization?
	public long maleCount(List<EmployeeBean> list) {

		return list.stream().filter(emp -> "Male".equals(emp.getGender())).count();

	}

	public long femaleCount(List<EmployeeBean> list) {
		return list.stream().filter(emp -> "Female".equals(emp.getGender())).count();
	}

}
