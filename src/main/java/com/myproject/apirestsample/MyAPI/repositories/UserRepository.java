package com.myproject.apirestsample.MyAPI.repositories;

import com.myproject.apirestsample.MyAPI.handler.BusinessException;
import com.myproject.apirestsample.MyAPI.handler.CampoObrigatorioException;
import com.myproject.apirestsample.MyAPI.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {
    public void save(User user){
        if(user.getName()==null)
            throw new CampoObrigatorioException("name");
        if(user.getPassword()==null)
            throw new CampoObrigatorioException("password");
        if(user.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Neto","senhadoneto"));
        users.add(new User("Noah","senhadonoah"));
        return users;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Novo","novopassword");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User(username);
    }
}
