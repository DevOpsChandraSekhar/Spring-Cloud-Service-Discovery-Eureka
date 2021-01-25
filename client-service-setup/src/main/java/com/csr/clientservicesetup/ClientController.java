/**
 * 
 */
package com.csr.clientservicesetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.csr.EnableDiscovery.Employee;

/**
 * @author chandra
 *
 */
@RestController
public class ClientController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/clientService", method=RequestMethod.GET)
	@ResponseBody
	public Employee[] service() {
		Employee[] result=restTemplate.getForObject("http://Employee-Service/employee", Employee[].class);
		return result;
	}
}
