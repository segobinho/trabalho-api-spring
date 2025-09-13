package com.springboot.trabalhoSpringboot.service;

import com.springboot.trabalhoSpringboot.entity.Evolucao;
import com.springboot.trabalhoSpringboot.repository.EvolucaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;

@Service
public class EvolucaoService {

    private final EvolucaoRepository repository;

    public EvolucaoService(EvolucaoRepository repository) {
        this.repository = repository;
    }

    public List<Evolucao> findAll() {
        return repository.findAll();
    }

    public Evolucao findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Evolução com ID " + id + " não encontrada"
                ));
    }


}
