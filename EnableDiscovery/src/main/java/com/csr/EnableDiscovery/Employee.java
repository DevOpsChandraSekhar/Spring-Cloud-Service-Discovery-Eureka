/**
 * 
 */
package com.csr.EnableDiscovery;

/**
 * @author chandra
 *
 */
public class Employee {

	private Integer id;

    private String name;

    private String Location;

	
	public Employee(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}

	
    
}
