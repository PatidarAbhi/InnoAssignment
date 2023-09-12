package Ass1;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentList {

	public List<String> getAllDepartments(List<EmployeeBean> list) {

		return list.stream().map(emp -> emp.getDepartment()).distinct().collect(Collectors.toList());
		//return list.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet());
	}

}
