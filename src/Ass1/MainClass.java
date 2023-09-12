package Ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
		employeeList.add(new EmployeeBean(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new EmployeeBean(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new EmployeeBean(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new EmployeeBean(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new EmployeeBean(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new EmployeeBean(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new EmployeeBean(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new EmployeeBean(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new EmployeeBean(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new EmployeeBean(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new EmployeeBean(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new EmployeeBean(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new EmployeeBean(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new EmployeeBean(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new EmployeeBean(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new EmployeeBean(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new EmployeeBean(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		Question_01 q1 = new Question_01();
		long maleCount = q1.maleCount(employeeList);
		System.out.println("Male Employee : " + maleCount);
		long femaleCount = q1.maleCount(employeeList);
		System.out.println("Female Employee : " + femaleCount);
		System.out.println();

		DepartmentList departmentList = new DepartmentList();
		List<String> list = departmentList.getAllDepartments(employeeList);
		System.out.println("Departments in Organization : " + list);
		System.out.println();

		AvgAgeOfEmployee ageOfEmployee = new AvgAgeOfEmployee();
		double maleAvg = ageOfEmployee.getAverageAgeMale(employeeList);
		System.out.println("Average Age Male : " + maleAvg);
		double FemaleAvg = ageOfEmployee.getAverageAgeFemale(employeeList);
		System.out.println("Average Age Female : " + FemaleAvg);
		System.out.println();

		MaxSalary maxSalary = new MaxSalary();
		EmployeeBean employeeBean = maxSalary.getMaxSalary(employeeList);
		System.out.println("max salay Employee detail"+employeeBean);
		System.out.println();

		Question_5 q5 = new Question_5();
		List<String> joinedAfter2015 = q5.joinedAfter2015(employeeList);
		System.out.println("Employee Names who have joinind after 2015 : " + joinedAfter2015);
		System.out.println();

		NumberOfEmployeeEachDepartment department = new NumberOfEmployeeEachDepartment();
		Map<String, Long> empCountInDep = department.GetNoOfEmployeeInDep(employeeList);
		System.out.println("Number of employees in each department : " + empCountInDep);
		System.out.println();

		AvgSalaryOfEachDepartment avgSalaryOfEachDepartment = new AvgSalaryOfEachDepartment();
		Map<String, Double> avgSalary = avgSalaryOfEachDepartment.avgSalary(employeeList);
		System.out.println("Average salary of each department : " + avgSalary);
		System.out.println();

		YoungestEmployee employee = new YoungestEmployee();
		System.out.println("Youngest Employee : " + employee.GetYoungestEmp(employeeList));
		MaleAndFeamleInSales maleAndFeamleInSales = new MaleAndFeamleInSales();
		long femaleInSandM = maleAndFeamleInSales.GetNoOfFemaleInSandM(employeeList);
		long maleInSandM = maleAndFeamleInSales.GetNoOfMaleInSandM(employeeList);
		System.out.println("Count of Female In Sales and Marketing : " + femaleInSandM);
		System.out.println("Count of Male In Sales and Marketing : " + maleInSandM);
		System.out.println();

		AvgSalary salary = new AvgSalary();
		double avgMaleSal = salary.avgOfMale(employeeList);
		System.out.println("Average salary of Male : " + avgMaleSal);
		double avgFemaleSal = salary.avgOfFemale(employeeList);
		System.out.println("Average salary of Female : " + avgFemaleSal);
		System.out.println();

		/*EmployeeNameInDept nameInDept = new EmployeeNameInDept();
		Map<String, List<EmployeeBean>> map = nameInDept.empNameInDeps(employeeList);
		System.out.println("Name of Employee in department");
		for (Map.Entry<String, List<EmployeeBean>> m1 : map.entrySet()) {
			System.out.print(m1.getKey() + " = ");
			List<EmployeeBean> l1 = m1.getValue();
			l1.forEach(e -> System.out.print(e.getName() + ", "));
			System.out.println();
		}*/
		EmployeeNameInDept nameInDept = new EmployeeNameInDept();
		System.out.println("Name of Employee in department"+nameInDept.empNameInDeps(employeeList));
		System.out.println();

		AvgSalaryAndTotalSalary andTotalSalary = new AvgSalaryAndTotalSalary();
		System.out.println("Total Salary : " + andTotalSalary.totalSalary(employeeList));
		System.out.println("Average Salary : " + andTotalSalary.avgSalary(employeeList));
		System.out.println();

		SeparteEmployee employee2 = new SeparteEmployee();
		System.out.println("Employees younger than or equal to 25 : " + employee2.youngerThan25(employeeList));
		System.out.println("Employees older than  25 : " + employee2.olderThan25(employeeList));
		System.out.println();

		OldestEmployee oldestEmployee = new OldestEmployee();
		EmployeeBean oldest = oldestEmployee.oldestEmployee(employeeList);
		System.out.println("Oldest Employees : " + oldest);
		System.out.println("Age : " + oldest.getAge());
		System.out.println("Department : " + oldest.getDepartment());
	}

}
