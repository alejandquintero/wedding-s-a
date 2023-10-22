package com.wedding.api.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class PersonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "idperson")
	private Integer idPerson;	

	@ManyToOne
	@JoinColumn(name = "idfamily")
	@JsonBackReference
	private FamilyModel family;

	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "accepted")
	private Boolean accepted;

	public Integer getIdPerson()
	{
		return idPerson;
	}

	public FamilyModel getFamily()
	{
		return family;
	}

	public String getName()
	{
		return name;
	}

	public String getLastname()
	{
		return lastname;
	}

	public Boolean getAccepted()
	{
		return accepted;
	}

	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}

	public void setFamily(FamilyModel family) {
		this.family = family;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
}
