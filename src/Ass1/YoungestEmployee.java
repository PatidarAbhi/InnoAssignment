package Ass1;

import java.util.Comparator;
import java.util.List;

public class YoungestEmployee {

	public EmployeeBean GetYoungestEmp(List<EmployeeBean> list)
	{
		return list.stream().filter(emp->(emp.getDepartment().equalsIgnoreCase("Product Development"))).
				    min(Comparator.comparing(EmployeeBean::getAge)).get();
	}

}
