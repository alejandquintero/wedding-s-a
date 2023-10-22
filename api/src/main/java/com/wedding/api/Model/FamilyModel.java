package com.wedding.api.Model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="family")
public class FamilyModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "idfamily")
	private Integer idFamily;

	private Integer code;
	private String name;

	@OneToMany(mappedBy = "family", cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
	@JsonManagedReference
    private List<PersonModel> members = new ArrayList<>();
	
	public Integer getIdFamily(){
		return idFamily;
	}

	public Integer getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public List<PersonModel> getMembers(){
		return members;
	}
}
