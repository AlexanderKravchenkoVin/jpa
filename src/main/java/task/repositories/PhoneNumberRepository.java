package task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import task.entites.PhoneNumber;


public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {


}
