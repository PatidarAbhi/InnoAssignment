package Ass1;

import java.util.List;
import java.util.stream.Collectors;

public class SeparteEmployee {
	public List<EmployeeBean> youngerThan25(List<EmployeeBean> list) {
		return list.stream().filter(e -> e.getAge() <= 25).collect(Collectors.toList());
	}

	public List<EmployeeBean> olderThan25(List<EmployeeBean> list) {
		return list.stream().filter(e -> e.getAge() > 25).collect(Collectors.toList());
	}

}
