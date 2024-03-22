package com.example.miniprogetto.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserCongig {
    /*@Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User ciro = new User(
                    "Ciro",
                    "cilahara@yahoo.it",
                    "1234"
            );
            User katia = new User(
                    "Katia",
                    "katia.pompei@yahoo.it",
                    "1234"
            );

            repository.saveAll(List.of(ciro,katia));
        };
    }*/
}
