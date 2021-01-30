package com.namegenerator.au2021rest;

//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Path("/fullname")
//public class FullNameGenerator {
//
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String generate(String firstName, String lastName) {
//		return firstName+lastName;
//	}
//	
//}

@RestController
@RequestMapping(path="/stringoperations")
public class FullNameController{
	
	@GetMapping("/concatenation/{firstName}/{lastName}")
	public String generate(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName)
	{
		return firstName+lastName;
	}
	
	@GetMapping("split/{string1}/{string2}")
	public String split(@PathVariable("string1") String firstName, @PathVariable("string2") String lastname)
	{
		return firstName.split(lastname)[0];
	}
	
	@GetMapping("length/{string1}")
	public int lengthOfString(@PathVariable("string1") String string1)
	{
		return string1.length();
	}
	
	@GetMapping("replace/{string1}/{char1}/{char2}")
	public String replaceChars(@PathVariable("string1") String string1, @PathVariable("char1") char char1, @PathVariable("char2") char char2)
	{
		return string1.replace(char1,char2);
	}
	
	@GetMapping("index/{string1}/{string2}")
	public int lengthOfString(@PathVariable("string1") String string1, @PathVariable("string2") String string2)
	{
		return string1.indexOf(string2);
	}
	
	@GetMapping("upper/{string1}")
	public String stringToUpper(@PathVariable("string1") String string1)
	{
		return string1.toUpperCase();
	}
	
	@GetMapping("lower/{string1}")
	public String stringToLower(@PathVariable("string1") String string1)
	{
		return string1.toLowerCase();
	}
}