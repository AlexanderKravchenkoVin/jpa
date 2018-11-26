package task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import task.entites.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    void deleteContactById(Long id);

}
