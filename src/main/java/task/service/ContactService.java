package task.service;

import task.entites.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllContacts();

    Contact save(Contact contact);

    void deleteContactById(Long id);
}