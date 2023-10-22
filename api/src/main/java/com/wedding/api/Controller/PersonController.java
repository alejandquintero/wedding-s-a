package com.wedding.api.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.api.Model.PersonModel;
import com.wedding.api.Service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personService;

	@GetMapping()
	public ArrayList<PersonModel> getPersons(){
		return personService.getPersons();
	}

}