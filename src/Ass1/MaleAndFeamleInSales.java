package Ass1;

import java.util.List;

public class MaleAndFeamleInSales {

	public long GetNoOfMaleInSandM(List<EmployeeBean> list)
	{
		return list.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment()) && "Male".equals(e.getGender())).count();
	}
	public long GetNoOfFemaleInSandM(List<EmployeeBean> list)
	{
		return list.stream().filter(e -> "Sales And Marketing".equals(e.getDepartment()) && "Female".equals(e.getGender())).count();
	}

}
