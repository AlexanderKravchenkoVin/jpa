package task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import task.entites.Contact;
import task.entites.PhoneNumber;
import task.repositories.ContactRepository;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @Bean
    public CommandLineRunner demo(ContactRepository repository) {
        return (args) -> {
            // save a couple of contacts
            repository.save(new Contact((long) 1, "Jack", "Bran", "war@gmail.com", Arrays.asList(new PhoneNumber("Life", "0636546563"))));
            repository.save(new Contact((long) 2, "Rob", "O'Brian", "rag@gmail.com", Arrays.asList(new PhoneNumber("MTS", "0501212128"))));
            repository.save(new Contact((long) 3, "Bob", "Bauer", "ben@gmail.com", Arrays.asList(new PhoneNumber("Life", "0932525252"))));
            repository.save(new Contact((long) 4, "David", "Palmer", "dog@gmail.com", Arrays.asList(new PhoneNumber("Kyivstar", "0966666665"))));
            repository.save(new Contact((long) 5, "Michail", "Kristi", "mic@gmail.com", Arrays.asList(new PhoneNumber("Life", "0927785592"))));
        };
    }

}





