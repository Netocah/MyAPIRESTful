package com.myproject.apirestsample.MyAPI.controller;
import java.util.List;

import com.myproject.apirestsample.MyAPI.model.User;
import com.myproject.apirestsample.MyAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping //GET/users para retornar todos os usuários
    public List<User> list(){
        return repository.findAll();
    }
    @PostMapping //POST/users para salvar um novo usuário;
    public void save(@RequestBody User user) {
        repository.save(user);
    }
    @PutMapping //PUT/users para alterar um usuário;
    public void update(@RequestBody User user){
        repository.save(user);
    }
    @GetMapping("/{username}") //GET/users/{username} para retornar um usuário pelo seu username;
    public User find(@PathVariable("/username")String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping(path = { "/{id}" }) //DELETE/users/{id} para remover um usuário pelo seu id.
    public void delete(@PathVariable("id") int id) {
        repository.deleteById(id);
    }
}
