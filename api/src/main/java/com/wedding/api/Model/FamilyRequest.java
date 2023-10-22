package com.wedding.api.Model;

import java.util.List;

public class FamilyRequest {
	private Integer idFamily;
	private List<MemberRequest> members;

    public Integer getIdFamily() {
		return idFamily;
	}
	public List<MemberRequest> getMembers() {
		return members;
	}
	public void setIdFamily(Integer idFamily) {
		this.idFamily = idFamily;
	}
	public void setMembers(List<MemberRequest> members) {
		this.members = members;
	}
}