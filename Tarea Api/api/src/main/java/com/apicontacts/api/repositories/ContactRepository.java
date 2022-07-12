package com.apicontacts.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apicontacts.api.models.ContactModel;

@Repository
public interface ContactRepository extends CrudRepository<ContactModel, Long> {

}
    
