package com.wedding.api.Repository;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wedding.api.Model.FamilyModel;

@Repository
public interface FamilyRepository extends CrudRepository<FamilyModel, Integer> {
	ArrayList<FamilyModel> findByCode(Integer code);
	FamilyModel findByIdFamily(Integer idFamily);

}