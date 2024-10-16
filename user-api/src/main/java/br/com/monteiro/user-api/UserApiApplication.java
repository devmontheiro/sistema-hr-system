package br.com.monterio.userapi;

import br.com.monterio.userapi.domain.User;
import br.com.monterio.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class UserApiApplication implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {SpringApplication.run(UserApiApplication.class, args);
    }
    @Override
    public void run(String... args) throws  Exception {
        userRepository.saveAll(List.of(
                new User(null, "Joao Monteiro", "devmontheiro@gmail.com", "123", 20.0),
                new User(null, "Joao Dev", "dev@gmail.com", "456", 10.0)

                ));

    }

}
