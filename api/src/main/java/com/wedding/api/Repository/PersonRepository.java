package com.wedding.api.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wedding.api.Model.PersonModel;


@Repository
public interface PersonRepository extends CrudRepository<PersonModel, Integer>{

}
