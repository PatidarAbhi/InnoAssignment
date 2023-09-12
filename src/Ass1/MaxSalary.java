package Ass1;

import java.util.Comparator;
import java.util.List;

public class MaxSalary {
    
	public EmployeeBean getMaxSalary(List<EmployeeBean> list)
	{
		//list.stream().max(Comparator.comparing(emp->emp.getAge()));
		return list.stream().max(Comparator.comparing(EmployeeBean::getSalary)).get();
	}
}
