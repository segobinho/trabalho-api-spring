package com.springboot.trabalhoSpringboot.controller;

import com.springboot.trabalhoSpringboot.entity.CreateUser;
import com.springboot.trabalhoSpringboot.entity.User;
import com.springboot.trabalhoSpringboot.interfaces.UserControllerInterface;
import com.springboot.trabalhoSpringboot.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserControllerInterface {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @Override
    public List<User> findAll() {
        return service.findAll();
    }

    @Override
    public User findById(Long id) {
        return service.findById(id);
    }

    @Override
    public User save(CreateUser userDTO) {
        return service.save(userDTO);
    }

    @Override
    public User update(Long id, CreateUser userDTO) {
        return service.update(id, userDTO);
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }
}
