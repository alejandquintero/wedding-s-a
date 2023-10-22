package com.wedding.api.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.api.Model.PersonModel;
import com.wedding.api.Repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;

	public ArrayList<PersonModel> getPersons(){
		return (ArrayList<PersonModel>) personRepository.findAll();
	}	
}
