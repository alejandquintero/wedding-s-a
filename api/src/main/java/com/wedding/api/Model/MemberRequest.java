package com.wedding.api.Model;

public class MemberRequest {
	private Integer idPerson;
	private Boolean accepted;

    public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}
	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}
	
	public Integer getIdPerson() {
		return idPerson;
	}
	public Boolean getAccepted() {
		return accepted;
	}
	
}
