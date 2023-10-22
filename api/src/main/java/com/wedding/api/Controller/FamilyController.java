package com.wedding.api.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.api.Model.FamilyModel;
import com.wedding.api.Model.FamilyRequest;
import com.wedding.api.Model.MemberRequest;
import com.wedding.api.Service.FamilyService;

@RestController
@RequestMapping("/family")
public class FamilyController {
	@Autowired
	FamilyService familyService;

	@GetMapping()
	public ArrayList<FamilyModel> getFamilies(){
		return familyService.getFamilies();
	}

	@GetMapping("/{code}/members")
	public ArrayList<FamilyModel> getMembersByFamilyCode(@PathVariable Integer code){
		return familyService.getMembersByFamilyCode(code);
	}

	@PostMapping()
	public FamilyModel updateStatusAccepted(@RequestBody FamilyRequest requestBody){

		Integer idFamily = requestBody.getIdFamily();
		List<MemberRequest> memberRequest = requestBody.getMembers();

		familyService.updateStatus(idFamily, memberRequest);
		return familyService.getMembersByIdFamily(idFamily);
	}


}
