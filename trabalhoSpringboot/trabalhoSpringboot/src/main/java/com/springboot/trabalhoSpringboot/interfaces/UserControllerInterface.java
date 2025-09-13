package com.springboot.trabalhoSpringboot.interfaces;

import com.springboot.trabalhoSpringboot.entity.CreateUser;
import com.springboot.trabalhoSpringboot.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
public interface UserControllerInterface {

    @GetMapping
    List<User> findAll();

    @GetMapping("/{id}")
    User findById(@PathVariable Long id);

    @PostMapping
    User save(@RequestBody CreateUser userDTO);

    @PutMapping("/{id}")
    User update(@PathVariable Long id, @RequestBody CreateUser userDTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);
}
