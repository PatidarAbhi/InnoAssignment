package Ass1;

import java.util.List;
import java.util.stream.IntStream;

public class AvgAgeOfEmployee {
        public Double getAverageAgeMale(List<EmployeeBean> emp)
        {
        	//IntStream st =emp.stream().mapToInt(emp1->emp1.getAge());

        	return emp.stream()
        		    .filter(e -> e.getGender().equals("Male"))   
        		    .mapToInt(EmployeeBean::getAge)              
        		    .average()                                   
        		    .orElse(0.0);     
        }
        
        public Double getAverageAgeFemale(List<EmployeeBean> emp)
        {
        	return emp.stream()
        		    .filter(e -> e.getGender().equals("Female"))   
        		    .mapToInt(EmployeeBean::getAge)                
        		    .average()                                   
        		    .orElse(0.0);     
        }
}
