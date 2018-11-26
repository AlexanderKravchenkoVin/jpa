package task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.entites.PhoneNumber;
import task.service.PhoneNumberService;

import java.util.Objects;

@RestController
public class PhoneNumberController {


    @Autowired
    private PhoneNumberService phoneNumberService;

    @PatchMapping("/number")
    public PhoneNumber updateNumber(@RequestBody PhoneNumber phoneNumber) {
        if (Objects.isNull(phoneNumber.getId())) {
            throw new IllegalArgumentException("Updating required for id");
        }
        return phoneNumberService.update(phoneNumber);
    }

    @PostMapping("/number/{contactId}")
    public void addNumber(@PathVariable Long contactId, @RequestBody PhoneNumber  phoneNumber){
         phoneNumberService.save(contactId, phoneNumber);
    }

}