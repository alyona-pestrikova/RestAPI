package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User getById(Long id);
    void deleteById(Long id);
    void editUser(User user);
    User findByUsername(String username);
    List<User> findAll();
    void saveUser(User user);
}
