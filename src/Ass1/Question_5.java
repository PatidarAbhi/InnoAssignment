package Ass1;

import java.util.List;
import java.util.stream.Collectors;

public class Question_5 {

	public List<String> joinedAfter2015(List<EmployeeBean> list)
	{
		int targetYear = 2015;
		return list.stream().filter(e -> e.getYearOfJoining() > targetYear)
				.map(EmployeeBean::getName).collect(Collectors.toList());
	}
}
