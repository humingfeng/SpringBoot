package com.humingfeng.validatingforminput;

import com.humingfeng.validatingforminput.domain.User;
import com.humingfeng.validatingforminput.domain.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidatingFormInputApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ValidatingFormInputApplication.class, args);
    }

    private Logger LOG = LoggerFactory.getLogger(ValidatingFormInputApplication.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Sergey", 24, "1994-01-01");
        User user2 = new User("Ivan", 26, "1994-01-01");
        User user3 = new User("Adam", 31, "1994-01-01");
        LOG.info("Inserting data in DB.");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        LOG.info("User count in DB: {}", userRepository.count());
        LOG.info("User with ID 1: {}", userRepository.findById(1L));
        LOG.info("Deleting user with ID 2L form DB.");
        userRepository.deleteById(2L);
        LOG.info("User count in DB: {}", userRepository.count());
    }
}
