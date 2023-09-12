package Ass1;

import java.util.List;

public class AvgSalaryAndTotalSalary {
      
	public double totalSalary(List<EmployeeBean> list)
	{
		return list.stream().map(e -> e.getSalary()).reduce(0.0, Double::sum);
	}
	public double avgSalary(List<EmployeeBean> list)
	{
		double totalSal = totalSalary(list);
		return totalSal/list.size();
	}
}
