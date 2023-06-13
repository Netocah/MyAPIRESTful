package com.myproject.apirestsample.MyAPI;

import com.myproject.apirestsample.MyAPI.model.User;
import com.myproject.apirestsample.MyAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Neto", "123");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
