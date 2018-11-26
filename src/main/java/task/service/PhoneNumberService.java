package task.service;


import task.entites.PhoneNumber;

public interface PhoneNumberService {

    PhoneNumber update(PhoneNumber phoneNumber);

    void save(Long contactId, PhoneNumber phoneNumber);
}
