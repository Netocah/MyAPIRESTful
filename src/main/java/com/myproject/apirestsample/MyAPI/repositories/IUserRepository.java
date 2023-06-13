package com.myproject.apirestsample.MyAPI.repositories;

import com.myproject.apirestsample.MyAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
