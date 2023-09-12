package Ass1;

import java.util.List;
import java.util.stream.Collectors;

public class AvgSalary {

	public double avgOfMale(List<EmployeeBean> list)
	{   return list.stream().filter(e -> "Male".equals(e.getGender())).
		collect(Collectors.averagingDouble(EmployeeBean::getSalary));
		
		/*List<EmployeeBean> maleEmp = list.stream().filter(e -> "Male".equals(e.getGender())).collect(Collectors.toList());
		
		Double sum = maleEmp.stream().map(emp -> emp.getSalary()).reduce(0.0,Double::sum);
		return sum/maleEmp.size();*/
	
	}
	public double avgOfFemale(List<EmployeeBean> list)
	{
		/*List<EmployeeBean> femaleEmp = list.stream().filter(e -> "Female".equals(e.getGender())).collect(Collectors.toList());
		
		Double sum = femaleEmp.stream().map(e -> e.getSalary()).reduce(0d,(e,i)->e+i);
		
		return sum/femaleEmp.size();*/
		 return list.stream().filter(e -> "Female".equals(e.getGender())).
					collect(Collectors.averagingDouble(EmployeeBean::getSalary));
	}

}
