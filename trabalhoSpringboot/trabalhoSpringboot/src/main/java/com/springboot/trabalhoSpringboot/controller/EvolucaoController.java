package com.springboot.trabalhoSpringboot.controller;

import com.springboot.trabalhoSpringboot.entity.Evolucao;
import com.springboot.trabalhoSpringboot.interfaces.EvolucaoControllerInterface;
import com.springboot.trabalhoSpringboot.service.EvolucaoService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EvolucaoController implements EvolucaoControllerInterface {

    private final EvolucaoService service;

    public EvolucaoController(EvolucaoService service) {
        this.service = service;
    }

    @Override
    public List<Evolucao> findAll() {
        return service.findAll();
    }

    @Override
    public Evolucao findById(Long id) {
        return service.findById(id);
    }
}
