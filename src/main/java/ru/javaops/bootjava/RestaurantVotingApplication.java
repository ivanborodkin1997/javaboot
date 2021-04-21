package ru.javaops.bootjava;


import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.javaops.bootjava.model.Role;
import ru.javaops.bootjava.model.User;
import ru.javaops.bootjava.repository.UserRepository;

@SpringBootApplication
@AllArgsConstructor
public class RestaurantVotingApplication implements ApplicationRunner {
    private final UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }

    @Override
    public void run (ApplicationArguments args) throws Exception {
        userRepository.save(new User("user@gmail.com", "User_first", "User_last", "heroes123", Role.ROLE_USER));
        userRepository.save(new User("admin@gmail.com", "Admin_first", "Admin_last", "heroes1234", Role.ROLE_ADMIN));
        System.out.println(userRepository.findAll());
    }

}
