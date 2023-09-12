package Ass1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNameInDept {
   
	public Map<String, List<String>> empNameInDeps(List<EmployeeBean> list)
	{
		return list.stream().collect(Collectors.groupingBy
				(EmployeeBean::getDepartment,Collectors.mapping(EmployeeBean::getName, Collectors.toList())
	));
	}

}
