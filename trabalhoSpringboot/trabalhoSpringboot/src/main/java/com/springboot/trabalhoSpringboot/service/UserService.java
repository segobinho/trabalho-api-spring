package com.springboot.trabalhoSpringboot.service;

import com.springboot.trabalhoSpringboot.entity.CreateUser;
import com.springboot.trabalhoSpringboot.entity.User;
import com.springboot.trabalhoSpringboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public User save(CreateUser userDTO) {
        User user = mapDtoToEntity(userDTO);
        user.setEvolucoes(null);
        return repository.save(user);
    }

    public User update(Long id, CreateUser userDTO) {
        User user = findById(id);

        user.setName(userDTO.getName());
        user.setMeta(userDTO.getMeta());
        user.setSexo(userDTO.getSexo());
        user.setDataNasc(userDTO.getDataNasc());
        user.setPeso(userDTO.getPeso());
        user.setAltura(userDTO.getAltura());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setSobrenome(userDTO.getSobrenome());

        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private User mapDtoToEntity(CreateUser dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setMeta(dto.getMeta());
        user.setSexo(dto.getSexo());
        user.setDataNasc(dto.getDataNasc());
        user.setPeso(dto.getPeso());
        user.setAltura(dto.getAltura());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setSobrenome(dto.getSobrenome());
        return user;
    }
}
