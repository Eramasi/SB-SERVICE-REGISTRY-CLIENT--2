package com.PhoneBook.App.RestAPI2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value= "/Hello/{name}")
	public String HelloMethod(@PathVariable("name") String name)
	{
		System.out.println("Inter-Service-Communication");
		return  " Hello " + name + "  How r u ? ";
		
		
	}
	
	
	
}
