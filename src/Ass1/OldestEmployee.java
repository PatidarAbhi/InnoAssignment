package Ass1;

import java.util.Comparator;
import java.util.List;

public class OldestEmployee {

	public EmployeeBean oldestEmployee(List<EmployeeBean> list) {
		//return list.stream().max(Comparator.comparing(emp->emp.getAge())).get();
		return list.stream().max(Comparator.comparing(EmployeeBean::getAge)).get();
	}

}
