package Ass1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryOfEachDepartment {
	
	public Map<String, Double> avgSalary(List<EmployeeBean> list)
	{
		/*Map<String, Double> departmentAverageSalaries1 = list.stream()
		        .collect(Collectors.groupingBy(EmployeeBean::getDepartment,
		        		max(Comparator.comparing(EmployeeBean::getSalary)));
		*/
		Map<String, Double> departmentAverageSalaries = list.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getDepartment,
                        Collectors.averagingDouble(EmployeeBean::getSalary)));
		return departmentAverageSalaries;
	}


}
