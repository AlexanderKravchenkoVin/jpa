package task.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.entites.Contact;
import task.entites.PhoneNumber;
import task.repositories.ContactRepository;
import task.repositories.PhoneNumberRepository;
import task.service.PhoneNumberService;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    @Autowired
    private ContactRepository contactRepository;


    @Override
    public PhoneNumber update(PhoneNumber phoneNumber) {
        PhoneNumber entity = phoneNumberRepository.getOne(phoneNumber.getId());
        entity.setNumber(phoneNumber.getNumber());
        entity.setOperatorName(phoneNumber.getOperatorName());

        return phoneNumberRepository.save(entity);
    }

    @Override
    public void save(Long contactId, PhoneNumber phoneNumber) {
        Contact contact = contactRepository.getOne(contactId);
        contact.getPhoneNumbers().add(phoneNumber);
        contactRepository.save(contact);
    }
}