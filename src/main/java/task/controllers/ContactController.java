package task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.entites.Contact;
import task.service.ContactService;

import java.util.List;
import java.util.Objects;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact) {
        if (Objects.nonNull(contact.getId())) {
            throw new IllegalArgumentException("for creating contact property 'id' should be equals null");
        }
        return contactService.save(contact);
    }

    @PatchMapping("/contact")
    public Contact updateContact(@RequestBody Contact contact) {
        if (Objects.nonNull(contact.getId())) {
            throw new IllegalArgumentException("for creating contact property 'id' should be equals null");
        }
        return contactService.save(contact);
    }

    @DeleteMapping("/contact/{id}")
    public void deleteContactById(@PathVariable Long id) {
        contactService.deleteContactById(id);

    }

}