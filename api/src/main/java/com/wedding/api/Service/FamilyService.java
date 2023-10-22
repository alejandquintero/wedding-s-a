package com.wedding.api.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.api.Model.FamilyModel;
import com.wedding.api.Model.MemberRequest;
import com.wedding.api.Model.PersonModel;
import com.wedding.api.Repository.FamilyRepository;
import com.wedding.api.Repository.PersonRepository;

@Service
public class FamilyService {
	@Autowired
	FamilyRepository familyRepository;
	@Autowired
	PersonRepository personRepository;

	public ArrayList<FamilyModel> getFamilies(){
		return (ArrayList<FamilyModel>)familyRepository.findAll();
	}

	public ArrayList<FamilyModel> getMembersByFamilyCode(Integer code){
		return (ArrayList<FamilyModel>)familyRepository.findByCode(code);
	}
	
	public FamilyModel getMembersByIdFamily(Integer idFamily){
		return (FamilyModel)familyRepository.findByIdFamily(idFamily);
	}

	public void updateStatus(Integer idFamily, List<MemberRequest> members)
	{
		for( MemberRequest memberRequest : members)
		{
			Integer idPerson = memberRequest.getIdPerson();
			Boolean accepted = memberRequest.getAccepted();

			PersonModel person = personRepository.findById(idPerson).orElse(null);

			if (person != null)
			{
				person.setAccepted(accepted);
				personRepository.save(person);
			} 
		}
	}
}
