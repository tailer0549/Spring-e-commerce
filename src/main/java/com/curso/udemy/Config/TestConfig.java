package com.curso.udemy.Config;

import com.curso.udemy.Entities.User;
import com.curso.udemy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") // Precisa ser igual ao nome do application.properties
//  @profile diz que a classe é uma config específica para o perfil de teste.
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    // Tudo dentro desse metodo será executado quando a aplicação for iniciada
    // Tudo dentro desse metodo será executado quando a aplicação for iniciada
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
