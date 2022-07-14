package com.apicontacts.api.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicontacts.api.models.ContactModel;
import com.apicontacts.api.services.ContactService;


@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping()
    public ArrayList<ContactModel> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/{id}")
    public ContactModel getContactById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }

    @PostMapping()
    public ContactModel createContact(@RequestBody ContactModel contact) {
        return contactService.createContact(contact);
    }

    @PutMapping("/{id}")
    public ContactModel updateContact(@PathVariable Long id, @RequestBody ContactModel contact) {
        return contactService.updateContact(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }

}