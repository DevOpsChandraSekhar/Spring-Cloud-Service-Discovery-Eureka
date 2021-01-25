/**
 * 
 */
package com.csr.EnableDiscovery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandra
 *
 */
@RestController
public class EmployeeController {

	private static List<Employee> emplist=new ArrayList<Employee>();
	static {
		emplist.add(new Employee(1,"Chandra","Bangalore"));
		emplist.add(new Employee(2,"Rajendra","Hyderabad"));
		emplist.add(new Employee(3,"Krishna","Chennai"));
		emplist.add(new Employee(5,"Gopalan","Kolkata"));
	}
	
	@GetMapping("/employee")
	public ResponseEntity<?> getEmp(){
		return ResponseEntity.ok(emplist);
	}
}
