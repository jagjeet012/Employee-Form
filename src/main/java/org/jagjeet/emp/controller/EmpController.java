package org.jagjeet.emp.controller;

import org.jagjeet.emp.model.Address;
import org.jagjeet.emp.model.Employee;
import org.jagjeet.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {

	@Autowired
	private Employee employee;

	@Autowired
	private Address address;

	@Autowired
	private EmpService empService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";

	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String showEmployeeForm(@ModelAttribute("employee") Employee employee) {
		return "employee";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String getDetail(@RequestParam(value = "employeeId", required = true) Integer employeeId,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "phoneNumber", required = true) Integer phoneNumber,
			@RequestParam(value = "country", required = true) String country,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "pin", required = true) String pin) {

		employee.setEmployeeId(employeeId);
		employee.setName(name);
		employee.setPhone(phoneNumber);
		address.setCountry(country);
		address.setCity(city);
		address.setPin(pin);
		empService.addDetails(employee);
		empService.addAddress(address);
		
		

		return "employee";
	}
}
