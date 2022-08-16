package com.kara.contacts.repository;

import java.util.ArrayList;
import java.util.List;

import com.kara.contacts.pojo.Contact;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
    
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

}
