package Ass1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfEmployeeEachDepartment {
   
	public Map<String,Long> GetNoOfEmployeeInDep(List<EmployeeBean> list)
	{
		return list.stream().collect(Collectors.groupingBy(EmployeeBean::getDepartment, Collectors.counting()));
	}

}
