package com.apicontacts.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicontacts.api.models.ContactModel;
import com.apicontacts.api.repositories.ContactRepository;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public ArrayList<ContactModel> getAllContacts() {
        return (ArrayList<ContactModel>) contactRepository.findAll();
    }

    public ContactModel getContactById(Long id) {
        return contactRepository.findById(id).get();
    }

    public ContactModel createContact(ContactModel contact) {
        return contactRepository.save(contact);
    }

    public ContactModel updateContact(ContactModel contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
    
}
